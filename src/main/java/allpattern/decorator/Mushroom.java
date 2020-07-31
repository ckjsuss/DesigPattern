package allpattern.decorator;

/**
 * 配菜：蘑菇
 * @author Liu
 */
public class Mushroom implements SideDish {
    private final String name = "蘑菇";
    private final float price = 8.00f;
    private Hotpot hotpot;

    public Mushroom(Hotpot hotpot) {
        this.hotpot = hotpot;
        System.out.println("配菜："+name);
        System.out.println("价格："+price);
    }

    @Override
    public String getName() {
        return hotpot.getName()+"+"+name;
    }

    @Override
    public float getPrice() {
        return hotpot.getPrice() + price;
    }
}
