package allpattern.factory.abstracts;

import allpattern.factory.method.FruitFactory;

/**
 * 抽象工厂测试类
 * @author Liu
 */
public class AbstractFactoryTest {
    public static void main(String[] args){
        System.out.println("=============Factory01启动=============");
        Factory01 factory01 = new Factory01();
        FruitFactory fruitFactory = factory01.getFruitFactory();
        fruitFactory.getFruit();
        JuiceFactory juiceFactory = factory01.getJuiceFactory();
        juiceFactory.getJuice();
        System.out.println("=============Factory01结束=============");

        System.out.println("=============Factory02启动=============");
        Factory02 factory02 = new Factory02();
        FruitFactory fruitFactory02 = factory02.getFruitFactory();
        fruitFactory02.getFruit();
        JuiceFactory juiceFactory02 = factory02.getJuiceFactory();
        juiceFactory02.getJuice();
        System.out.println("=============Factory02结束=============");

    }
}
