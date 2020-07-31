package allpattern.bridge;

/**
 * 小米手机实现相关功能
 * @author Liu
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("XiaoMi open");
    }

    @Override
    public void call() {
        System.out.println("XiaoMi call");
    }

    @Override
    public void close() {
        System.out.println("XiaoMi close");
    }
}
