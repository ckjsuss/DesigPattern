package allpattern.adaptor.class_adaptor;

/**
 * 适配器
 * @author Liu
 */
public class VoltageAdapter3 extends Voltage220V implements VoltageOutPut{
    @Override
    public int outPut() {
        int i = super.outPut220V();
        i = i - 219;
        System.out.println("装换电压：" + i + "V");
        return i;
    }
}
