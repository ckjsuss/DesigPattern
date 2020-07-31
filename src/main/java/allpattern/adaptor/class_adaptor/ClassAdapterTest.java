package allpattern.adaptor.class_adaptor;

/**
 * 类适配器模式测试
 * @author Liu
 */
public class ClassAdapterTest {
    public static void main(String[] args){
        System.out.println("类适配器模式");
        Phone phone = new Phone();
        System.out.println("============VoltageAdapter1=========");
        phone.charge(new VoltageAdapter1().outPut());
        System.out.println("============VoltageAdapter2=========");
        phone.charge(new VoltageAdapter2().outPut());
        System.out.println("============VoltageAdapter3=========");
        phone.charge(new VoltageAdapter3().outPut());
    }
}
