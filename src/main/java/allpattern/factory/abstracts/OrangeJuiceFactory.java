package allpattern.factory.abstracts;

/**
 * 橘子汁工厂
 * @author Liu
 */
public class OrangeJuiceFactory implements JuiceFactory {
    @Override
    public Juice getJuice() {
        System.out.println("等到橘子汁");
        return new OrangeJuice();
    }
}
