package allpattern.action.command;

/**
 * 需求
 * @author Liu
 */
public class Require implements Group {
    @Override
    public void find() {
        System.out.println("查找到需求组");
    }

    @Override
    public void add() {
        System.out.println("增加一个需求");
    }

    @Override
    public void delete() {
        System.out.println("删除一个需求");
    }

    @Override
    public void change() {
        System.out.println("修改一个需求");
    }
}
