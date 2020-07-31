package allpattern.decorator;

/**
 * 清汤锅底
 * @author Liu
 */
public class QTHotpot implements Hotpot {

    private String HotpotName = "清汤锅底";
    private float HotpotPrice = 50.00f;

    public QTHotpot() {
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
