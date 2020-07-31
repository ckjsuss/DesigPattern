package allpattern.factory.abstracts;

import allpattern.factory.method.AppleFactory;
import allpattern.factory.method.FruitFactory;

/**
 * 工厂一号
 * @author Liu
 */
public class Factory01 implements AbstractFactory {
    @Override
    public FruitFactory getFruitFactory() {
        System.out.println("苹果工厂代工");
        return new AppleFactory();
    }

    @Override
    public JuiceFactory getJuiceFactory() {
        System.out.println("苹果汁工厂代工");
        return new AppleJuiceFactory();
    }
}
