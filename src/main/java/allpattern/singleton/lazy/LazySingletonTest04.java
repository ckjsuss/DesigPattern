package allpattern.singleton.lazy;
/**
 * 懒汉式（双重校验锁）
 * 问题：每个线程在获取该类的实例时，都需执行getInstance同步方法 造成效率低下
 * 改进： 该方法只执行一次实例化代码 后续获取该实例直接return
 * 开发推荐使用
 * @author Liu
 */
public class LazySingletonTest04 {

    /**
     *  重排序问题：https://www.jianshu.com/p/b4d4506d3585
     *  LazySingletonTest04 分配内存空间
     * 初始化 LazySingletonTest04；将 LazySingletonTest04 指向分配的内存空间。
     * 使用 volatile 会禁止JVM指令重排，从而保证在多线程下也能正常执行
     */
    private static volatile LazySingletonTest04 instance;

    private LazySingletonTest04() {
    }

    public static  LazySingletonTest04 getInstance() {
        if (instance == null) {
            synchronized(LazySingletonTest04.class) {
                if(instance == null){
                    // 只能是一个线程进入
                    instance = new LazySingletonTest04();
                }
            }
        }
        return instance;
    }
}
