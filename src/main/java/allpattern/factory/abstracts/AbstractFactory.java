package allpattern.factory.abstracts;

import allpattern.factory.method.FruitFactory;

public interface AbstractFactory {
    FruitFactory getFruitFactory();
    JuiceFactory getJuiceFactory();
}

