package allpattern.bridge;

/**
 * 桥接模式测试
 * @author Liu
 */
public class BridgeTest {
    public static void main(String[] args){
        FullPhone xiaoMifullPhone = new FullPhone(new XiaoMi());
        xiaoMifullPhone.open();
        xiaoMifullPhone.call();
        xiaoMifullPhone.close();
        System.out.println("===============================");
        FullPhone huaWeiFullPhone = new FullPhone(new HuaWei());
        huaWeiFullPhone.open();
        huaWeiFullPhone.call();
        huaWeiFullPhone.close();
        System.out.println("===============================");
        WaterDropPhone huaWeiWaterDropPhone = new WaterDropPhone(new HuaWei());
        huaWeiWaterDropPhone.open();
        huaWeiWaterDropPhone.call();
        huaWeiWaterDropPhone.close();
    }
}
