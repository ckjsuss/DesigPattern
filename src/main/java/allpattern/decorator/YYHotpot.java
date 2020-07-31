package allpattern.decorator;

/**
 * 鸳鸯锅底
 * @author Liu
 */
public class YYHotpot implements Hotpot {

    private String HotpotName = "鸳鸯锅底";
    private float HotpotPrice = 55.00f;

    public YYHotpot() {
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
