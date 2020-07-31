package allpattern.singleton.lazy;


/**
 * 懒汉式（同步代码块）
 * 解决 每个线程在获取该类的实例时，都需执行getInstance同步方法 造成效率低下的问题
 * 还是存在线程安全问题
 * @author Liu
 */
public class LazySingletonTest03 {
    private static LazySingletonTest03 instance;

    private LazySingletonTest03() {
    }

    public static LazySingletonTest03 getInstance() {
        if (instance == null) {
            // 时间片被抢占 存在多个线程在该位置等待,还是有可能创建多个实例
            synchronized(LazySingletonTest03.class) {
                instance = new LazySingletonTest03();
            }
        }
        return instance;
    }
}
