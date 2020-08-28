package allpattern.proxy.cglib;

/**
 * @author Liu
 */
public class CglibClient {
    public static void main(String[] args){
        UserDao userDao = new UserDao();
        UserDao proxyInstance = (UserDao)new ProxyFactory(userDao).getProxyInstance();
        System.out.println("class : "+proxyInstance.getClass());
        proxyInstance.Speak();
        int sum = proxyInstance.sum("11");
        System.out.println(sum);
        // final 修饰方法的是无法被代理的
        proxyInstance.get();
    }
}
