package allpattern.singleton.hungry;

/**
 * 单例测试
 * @author Liu
 */
public class SingletonMain01 {
    public static void main(String[] args){
        SingletonTest01 singleton1 = SingletonTest01.getInstance();
        SingletonTest01 singleton2 = SingletonTest01.getInstance();
        //地址值 相等
        System.out.println(singleton1 == singleton2);
        // hashcode 相等
        System.out.println("singleton1 hashcode:"+singleton1.hashCode()
                +"\nsingleton2 hashcode:"+singleton2.hashCode());
    }
}
