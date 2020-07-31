package allpattern.adaptor.object_adaptor;

/**
 * 对象适配器模式测试
 * @author Liu
 */
public class ObjectAdapterTest {
    public static void main(String[] args){
        System.out.println("对象适配器模式");
        Phone phone = new Phone();
        Voltage220V voltage220V = new Voltage220V();
        System.out.println("============VoltageAdapter1=========");
        phone.charge(new VoltageAdapter1(voltage220V).outPut());
        System.out.println("============VoltageAdapter2=========");
        phone.charge(new VoltageAdapter2(voltage220V).outPut());
        System.out.println("============VoltageAdapter3=========");
        phone.charge(new VoltageAdapter3(voltage220V).outPut());
    }
}
