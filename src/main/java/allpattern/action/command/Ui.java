package allpattern.action.command;

/**
 * 前端
 * @author Liu
 */
public class Ui implements Group {
    @Override
    public void find() {
        System.out.println("查找到美工组");
    }

    @Override
    public void add() {
        System.out.println("增加一个美工页面");
    }

    @Override
    public void delete() {
        System.out.println("删除一个美工页面");

    }

    @Override
    public void change() {
        System.out.println("修改一个美工页面");

    }
}
