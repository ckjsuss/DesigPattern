package allpattern.singleton.hungry;

/**
 * 饿汉式单例（静态常量）
 * 1、类装载的时候完成实例化，避免线程同步问题
 * 2、没有达到Lazy Loading的效果,
 * 该对象不管有没有使用都一直存在，内存浪费；
 * 经常使用
 * @author Liu
 */
public class SingletonTest01 {
    private SingletonTest01(){
    }

    private final static SingletonTest01 instance = new SingletonTest01();

    public static SingletonTest01 getInstance(){
        return instance;
    }
}
