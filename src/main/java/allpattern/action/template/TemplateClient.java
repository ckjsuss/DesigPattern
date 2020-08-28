package allpattern.action.template;

/**
 * @author Liu
 */
public class TemplateClient {
    public static void main(String[] args){
        CarModel carModel = new Benz();
        // 钩子方法 ==》 子类控制父类
        ((Benz) carModel).setAlarm(false);
        carModel.run();
        System.out.println("======================");
        Tesla tesla = new Tesla();
        tesla.run();
    }
}
