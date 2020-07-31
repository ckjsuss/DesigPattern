package allpattern.singleton.hungry;

/**
 * 饿汉式单例（静态代码块）
 * @author Liu
 */
public class SingletonTest02 {
    private SingletonTest02(){
    }

    private static SingletonTest02 instance;

    static {
        instance = new SingletonTest02();
    }

    public static final SingletonTest02 getInstance(){
        return instance;
    }
}
