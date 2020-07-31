package allpattern.singleton.inner;

/**
 * 单例 静态内部类
 * JVM 类装载是线程安全的
 * SingletonClass 的加载 不会加载InnerClass 满足懒加载
 * 在调用 getInstance() 时才加载InnerClass
 * 推荐使用
 * @author Liu
 */
public class SingletonClass {
    private SingletonClass(){}

    private static class InnerClass{
        /**
         *  静态变量只会通过类的一次加载静态属性；
         */
        private static final SingletonClass INSTANCE = new SingletonClass();
    }

    public static synchronized SingletonClass getInstance(){
        return InnerClass.INSTANCE;
    }
}
