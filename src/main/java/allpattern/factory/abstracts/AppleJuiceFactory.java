package allpattern.factory.abstracts;

/**
 * 苹果汁工厂
 * @author Liu
 */
public class AppleJuiceFactory implements JuiceFactory {
    @Override
    public Juice getJuice() {
        System.out.println("得到苹果汁");
        return new AppleJuice();
    }
}
