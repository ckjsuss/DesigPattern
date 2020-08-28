package allpattern.proxy.dynamic;

/**
 * @author Liu
 */
public class UserDao implements IUserDao {
    @Override
    public void Speak() {
        System.out.println("Speak.......");
    }

    @Override
    public void Eat(String name) {
        System.out.println("Eat:"+ name);
    }
}
