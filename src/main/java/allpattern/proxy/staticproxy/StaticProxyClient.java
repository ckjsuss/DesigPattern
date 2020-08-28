package allpattern.proxy.staticproxy;

/**
 * @author Liu
 */
public class StaticProxyClient {
    public static void main(String[] args){
        UserDao userDao = new UserDao();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
        userDaoProxy.Speak();
    }
}
