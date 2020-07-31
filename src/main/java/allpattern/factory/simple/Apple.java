package allpattern.factory.simple;

/**
 * 苹果实现水果接口
 * @author Liu
 */
public class Apple implements Fruit {

    @Override
    public void getFruit() {
        System.out.println("得到苹果！");
    }

}
