package allpattern.singleton.lazy;

/**
 *  懒汉式单例
 *  有Lazy Loading
 *  只适合于单线程环境，有线程安全问题（开发中不推荐使用）
 * @author Liu
 */
public class LazySingletonTest01 {
    private static LazySingletonTest01 instance;

    private LazySingletonTest01(){}

    public static LazySingletonTest01 getInstance(){
        if (instance == null) {
            instance = new LazySingletonTest01();
        }
        return instance;
    }
}
