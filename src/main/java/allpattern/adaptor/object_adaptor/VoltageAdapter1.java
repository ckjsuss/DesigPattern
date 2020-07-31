package allpattern.adaptor.object_adaptor;

/**
 * 适配器
 * @author Liu
 */
public class VoltageAdapter1 implements VoltageOutPut {
    /**
     * 被适配者
     */
    private Voltage220V voltage220V;

    public VoltageAdapter1(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int outPut(){
        if (voltage220V == null) {
           return 0;
        }
        int src = voltage220V.outPut220V();
        int outPut = src / 44;
        System.out.println("装换电压：" + outPut + "V");
        return outPut;
    }
}
