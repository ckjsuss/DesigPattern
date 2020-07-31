package allpattern.singleton.lazy;

import java.util.concurrent.*;

/**
 * 懒汉式 线程安全问题
 * 多线程测试
 * @author Liu
 */
public class LazySingletonMain {
    public static void main(String[] args) {
//        test01();
//        test02();
        test03();
//        test04();
    }

    public static void  test01(){
        final int size = 20;
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(20);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 20, 50, TimeUnit.MILLISECONDS, queue);
        for (int i = 0; i < size; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("LazySingletonTest01:"+ LazySingletonTest01.getInstance().hashCode());
                }
            });
        }
        pool.shutdown();
    }

    public static void  test02(){
        final int size = 20;
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(20);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 20, 50, TimeUnit.MILLISECONDS, queue);
        for (int i = 0; i < size; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("LazySingletonTest02:"+ LazySingletonTest02.getInstance().hashCode());
                }
            });
        }
        pool.shutdown();
    }

    public static void  test03(){
        final int size = 20;
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(20);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 20, 50, TimeUnit.MILLISECONDS, queue);
        for (int i = 0; i < size; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("LazySingletonTest03:"+ LazySingletonTest03.getInstance().hashCode());
                }
            });
        }
        pool.shutdown();
    }

    public static void  test04(){
        final int size = 20;
        BlockingQueue<Runnable> queue = new ArrayBlockingQueue<>(20);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 20, 50, TimeUnit.MILLISECONDS, queue);
        for (int i = 0; i < size; i++) {
            pool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("LazySingletonTest04:"+ LazySingletonTest04.getInstance().hashCode());
                }
            });
        }
        pool.shutdown();
    }

}
