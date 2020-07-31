package allpattern.factory.simple;

import allpattern.factory.method.Apple;
import allpattern.factory.method.Fruit;
import allpattern.factory.method.Orange;

/**
 *  水果工厂
 * @author Liu
 */
public class FruitFactory {
    public static Fruit getFurit(String fruitName) {
        // 苹果实例
        if (fruitName.equalsIgnoreCase("Apple")) {
            return new Apple();
         // 橘子实例
        } else if (fruitName.equalsIgnoreCase("Orange")) {
            return new Orange();
        } else {
            return null;
        }
    }
}
