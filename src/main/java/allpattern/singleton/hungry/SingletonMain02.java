package allpattern.singleton.hungry;

/**
 * 饿汉式单例测试
 * @author Liu
 */
public class SingletonMain02 {
    public static void main(String[] args){
        SingletonTest02 singleton1 = SingletonTest02.getInstance();
        SingletonTest02 singleton2 = SingletonTest02.getInstance();
        //地址值 相等
        System.out.println(singleton1 == singleton2);
        // hashcode 相等
        System.out.println("singleton1 hashcode:"+singleton1.hashCode()
                +"\nsingleton2 hashcode:"+singleton2.hashCode());
    }
}
