package allpattern.flyweight;

import java.util.HashMap;

/**
 * 网站工程类
 * @author Liu
 */
public class WebSiteFactory {
    /**
     * 共享数据（内部状态）
     */
    private HashMap<String,ConcreteWebSite> ConcreteWebSitePool = new HashMap<>();

    public ConcreteWebSite getWebSite(String Type){
        if (ConcreteWebSitePool.containsKey(Type)) {
            return ConcreteWebSitePool.get(Type);
        }else {
            ConcreteWebSite concreteWebSite = new ConcreteWebSite(Type);
            ConcreteWebSitePool.put(Type, concreteWebSite);
            return concreteWebSite;
        }
    }

    public int getConcreteWebSitePoolSize(){
        System.out.print("网站类型数量：");
        return ConcreteWebSitePool.size();
    }
}
