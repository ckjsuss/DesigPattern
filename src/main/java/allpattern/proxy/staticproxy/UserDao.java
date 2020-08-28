package allpattern.proxy.staticproxy;

/**
 * User被代理对象
 * @author Liu
 */
public class UserDao implements IUserDao {
    @Override
    public void Speak() {
        System.out.println("说话.......");
    }
}
