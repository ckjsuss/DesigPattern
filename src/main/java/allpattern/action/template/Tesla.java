package allpattern.action.template;

/**
 * @author Liu
 */
public class Tesla extends CarModel {

    @Override
    public void start() {
        System.out.println("Tesla发动……");
    }

    @Override
    public void stop() {
        System.out.println("Tesla停止……");
    }

    @Override
    public void alarm() {
        System.out.println("Tesla鸣笛……");
    }


}
