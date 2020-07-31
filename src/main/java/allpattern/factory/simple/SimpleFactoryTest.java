package allpattern.factory.simple;

/**
 * 测试简单工厂模式
 *
 * @author Liu
 */
public class SimpleFactoryTest {
    public static void main(String[]args){
        FruitFactory.getFurit("Apple").getFruit();
        FruitFactory.getFurit("Orange").getFruit();
    }
}
