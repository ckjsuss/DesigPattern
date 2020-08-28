package allpattern.proxy.dynamic;

/**
 * @author Liu
 */
public class DynamicClient {
    public static void main(String[] args){
        IUserDao iUserDao = new UserDao();
        IUserDao proxyInstance = (IUserDao)new UesrDaoProxyFactory(iUserDao).getProxyInstance();
        System.out.println("class: "+proxyInstance.getClass());
        // result: **.**.**.$Proxy0
        proxyInstance.Speak();
        proxyInstance.Eat("Milk");
    }
}
