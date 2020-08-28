package allpattern.action.visitor;

/**
 * 访问者模式 测试客户端
 * @author Liu
 */
public class VisitorClient {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new Man("zs"));
        objectStructure.add(new Woman("ls"));
        objectStructure.add(new Woman("ls01"));
        Success success = new Success();
        objectStructure.display(success);
        System.out.println("========================");
        Fail fail = new Fail();
        objectStructure.display(fail);
    }
}
