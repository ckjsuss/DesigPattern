package allpattern.action.mediator;

import java.util.Arrays;

/**
 * @author Liu
 */
public class MediatorClient {
    public static void main(String[] args) {
        System.out.println("小明 看小区房、农民房");
        Tenant xiaoMing = new Tenant("小明", Arrays.asList("XiaoQuFang", "NongMinFang"));
        xiaoMing.lookAtHouse();
    }
}
