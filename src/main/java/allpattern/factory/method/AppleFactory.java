package allpattern.factory.method;

/**
 *  苹果对水果工厂的实现
 * @author Liu
 */
public class AppleFactory implements FruitFactory{

    @Override
    public Apple getFruit() {
        System.out.println("得到苹果");
        return new Apple();
    }

}
