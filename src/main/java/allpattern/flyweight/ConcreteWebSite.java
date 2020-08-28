package allpattern.flyweight;

/**
 * @author Liu
 */
public class ConcreteWebSite extends WebSite {
    public String Type;

    public ConcreteWebSite(String type) {
        Type = type;
    }

    /**
     *
     * @param user 用户外部状态
     */
    @Override
    public void use(User user) {
        System.out.print("用户："+user.getName()+"^");
        System.out.println("网站发布形式："+ Type);
    }
}
