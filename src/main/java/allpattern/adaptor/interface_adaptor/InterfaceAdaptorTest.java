package allpattern.adaptor.interface_adaptor;
/**
 * 接口适配器模式测试
 * @author Liu
 */
public class InterfaceAdaptorTest {
    public static void main(String[] args){
        System.out.println("接口适配器模式");
        Phone phone = new Phone();
        AbstractAdaptor abstractAdaptor = new AbstractAdaptor() {
            @Override
            public int outPut5V() {
                return 5;
            }

            @Override
            public int outPut220V() {
                return 0;
            }

            @Override
            public int outPut0V() {
                return 0;
            }
        };
        phone.charge(abstractAdaptor.outPut5V());
    }
}
