package allpattern.factory.method;

/**
 * 橘子工厂
 * @author Liu
 */
public class OrangeFactory implements FruitFactory {

    @Override
    public Orange getFruit() {
        System.out.println("得到橘子");
        return new Orange();
    }

}
