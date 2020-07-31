package allpattern.factory.method;

/**
 * 测试 工厂方法模式
 * @author Liu
 */
class FactoryMethodTest {
    public static void main(String[] args) {
        //创建苹果工厂
        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.getFruit();
        apple.getFruit();

        //创建橘子工厂
        FruitFactory orangeFactory = new OrangeFactory();
        Fruit orange = orangeFactory.getFruit();
        orange.getFruit();

    }
}
