package allpattern.bridge;

public class WaterDropPhone extends Phone {
    public WaterDropPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        System.out.println("水滴屏手机");
        super.open();
    }

    @Override
    protected void call() {
        System.out.println("水滴屏手机");
        super.call();
    }

    @Override
    protected void close() {
        System.out.println("水滴屏手机");
        super.close();
    }
}
