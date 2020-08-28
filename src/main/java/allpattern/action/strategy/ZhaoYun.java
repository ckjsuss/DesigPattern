package allpattern.action.strategy;

/**
 * 赵云(策划调用者)
 * @author Liu
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;
        //刚刚到吴国的时候拆第一个
        System.out.println("1、刚刚到吴国的时候拆第一个...............");
        //拿到妙计
        context = new Context(new BackDoor());
        //拆开执行
        context.operate();
        System.out.println("===========================================");
        //刘备乐不思蜀，拆第二个
        System.out.println("2、刘备乐不思蜀，拆第二个...............");
        context = new Context(new GivenGreenLight());
        context.operate(); //执行第二个锦囊
        System.out.println("===========================================");
        //孙权的小兵追来，咋办？拆第三个
        System.out.println("3、孙权的小兵追来，咋办？拆第三个...............");
        context = new Context(new BlockEnemy());
        context.operate(); //孙夫人退兵
        System.out.println("===========================================");
    }
}
