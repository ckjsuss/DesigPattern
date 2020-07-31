package allpattern.adaptor.object_adaptor;

/**
 * 适配器
 * @author Liu
 */
public class VoltageAdapter2 implements VoltageOutPut {
    /**
     * 被适配者
     */
    private Voltage220V voltage220V;

    public VoltageAdapter2(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int outPut() {
        if (voltage220V == null) {
            return 0;
        }
        int i = voltage220V.outPut220V();
        i = i - 20;
        System.out.println("装换电压：" + i + "V");
        return i;
    }

}
