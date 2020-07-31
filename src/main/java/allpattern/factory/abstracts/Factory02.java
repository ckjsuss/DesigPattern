package allpattern.factory.abstracts;

import allpattern.factory.method.FruitFactory;
import allpattern.factory.method.OrangeFactory;

/**
 * 工厂2号
 * @author Liu
 */
public class Factory02 implements AbstractFactory {
    @Override
    public FruitFactory getFruitFactory() {
        System.out.println("橘子工厂代工");
        return new OrangeFactory();
    }

    @Override
    public JuiceFactory getJuiceFactory() {
        System.out.println("橘子汁工厂代工");
        return new OrangeJuiceFactory();
    }
}
