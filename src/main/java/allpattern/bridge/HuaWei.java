package allpattern.bridge;

public class HuaWei implements Brand {
    @Override
    public void open() {
        System.out.println("HuaWei open");
    }

    @Override
    public void call() {
        System.out.println("HuaWei call");
    }

    @Override
    public void close() {
        System.out.println("HuaWei close");
    }
}
