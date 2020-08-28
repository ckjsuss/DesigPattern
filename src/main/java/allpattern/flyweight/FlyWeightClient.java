package allpattern.flyweight;

/**
 * @author Liu
 */
public class FlyWeightClient {
    public static void main(String[] args){
        WebSiteFactory factory = new WebSiteFactory();
        ConcreteWebSite newsWebSite = factory.getWebSite("新闻");
        newsWebSite.use(new User("Tom"));
        System.out.println(factory.getConcreteWebSitePoolSize());
        ConcreteWebSite blogWebSite1 = factory.getWebSite("Blog");
        blogWebSite1.use(new User("Tom"));
        System.out.println(factory.getConcreteWebSitePoolSize());
        ConcreteWebSite blogWebSite2 = factory.getWebSite("Blog");
        blogWebSite2.use(new User("Jack"));
        System.out.println(factory.getConcreteWebSitePoolSize());
    }
}
