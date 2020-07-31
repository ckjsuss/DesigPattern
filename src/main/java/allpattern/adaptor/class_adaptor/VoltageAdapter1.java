package allpattern.adaptor.class_adaptor;

/**
 * 适配器
 * @author Liu
 */
public class VoltageAdapter1 extends Voltage220V implements VoltageOutPut {
    @Override
    public int outPut() {
        int src = outPut220V();
        int outPut = src / 44;
        System.out.println("装换电压：" + outPut + "V");
        return outPut;
    }
}
