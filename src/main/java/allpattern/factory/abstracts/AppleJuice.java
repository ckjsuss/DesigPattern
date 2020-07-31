package allpattern.factory.abstracts;

/**
 * 苹果汁产品
 * @author Liu
 */
public class AppleJuice implements Juice {
    @Override
    public void getJuice() {
        System.out.println("得到苹果汁！");
    }
}
