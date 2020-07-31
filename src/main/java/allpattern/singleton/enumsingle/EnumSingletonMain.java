package allpattern.singleton.enumsingle;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 枚举单例 测试
 * @author Liu
 */
public class EnumSingletonMain {
    public static void main(String[] args){
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode() == instance2.hashCode());
        test();
    }

    public static void  test(){
        final int size = 20;
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(20);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 20, 50, TimeUnit.MILLISECONDS, queue);
        for (int i = 0; i < size; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Singleton Enum:"+ Singleton.INSTANCE.hashCode());
                }
            });
        }
        pool.shutdown();
    }
}
