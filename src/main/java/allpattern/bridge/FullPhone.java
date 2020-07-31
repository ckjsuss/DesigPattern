package allpattern.bridge;

public class FullPhone extends Phone {
    public FullPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open(){
        System.out.println("全面屏手机");
        super.open();
    }

    @Override
    protected void call() {
        System.out.println("全面屏手机");
        super.call();
    }

    @Override
    protected void close() {
        System.out.println("全面屏手机");
        super.close();
    }
}
