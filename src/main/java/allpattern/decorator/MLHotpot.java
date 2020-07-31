package allpattern.decorator;

/**
 * 麻辣锅底
 * @author Liu
 */
public class MLHotpot implements Hotpot {

    private String HotpotName = "麻辣锅底";
    private float HotpotPrice = 60.00f;

    public MLHotpot() {
        System.out.println("锅底："+HotpotName);
        System.out.println("价格："+HotpotPrice);
    }

    @Override
    public String getName() {
        return HotpotName;
    }

    @Override
    public float getPrice() {
        return HotpotPrice;
    }
}
