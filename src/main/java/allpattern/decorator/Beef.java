package allpattern.decorator;

/**
 * 配菜:牛肉
 * @author Liu
 */
public class Beef implements SideDish {
    private final String name = "牛肉";
    private final float price = 15.00f;

    private Hotpot hotpot;

    public Beef(Hotpot hotpot) {
        this.hotpot = hotpot;
        System.out.println("配菜："+name);
        System.out.println("价格："+price);
    }

    @Override
    public String getName() {
        return hotpot.getName() +"+"+name;
    }

    @Override
    public float getPrice() {
        return  hotpot.getPrice() + price;
    }
}
