package allpattern.singleton.lazy;

/**
 * 懒汉式单例（同步方法）
 * 有Lazy Loading
 * 解决线程安全问题
 * 效率低下（每次实例都有同步锁）
 *
 * @author Liu
 */
public class LazySingletonTest02 {
    private static LazySingletonTest02 instance;

    private LazySingletonTest02() {
    }

    public static synchronized LazySingletonTest02 getInstance() {
        if (instance == null) {
            instance = new LazySingletonTest02();
        }
        return instance;
    }

}
