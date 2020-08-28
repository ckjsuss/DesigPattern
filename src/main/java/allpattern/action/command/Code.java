package allpattern.action.command;

/**
 * 编码人员
 * @author Liu
 */
public class Code implements Group {
    @Override
    public void find() {
        System.out.println("查到代码组");
    }

    @Override
    public void add() {
        System.out.println("添加新功能代码");
    }

    @Override
    public void delete() {
        System.out.println("添加新功能代码");
    }

    @Override
    public void change() {
        System.out.println("修改一个代码功能");
    }
}