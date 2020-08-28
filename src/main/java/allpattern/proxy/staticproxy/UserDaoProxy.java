package allpattern.proxy.staticproxy;

/**
 * User代理对象
 * @author Liu
 */
public class UserDaoProxy implements IUserDao {
    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void Speak() {
        System.out.println("---------begin proxy------");
        target.Speak();
        System.out.println("---------end proxy------");
    }
}
