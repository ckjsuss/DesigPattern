package allpattern.action.command;

/**
 * 命令请求类（发布者）
 *
 * @author Liu
 */
public class Invoker {
    private Command command;

    /**
     * 得到客户命令
     */
    public void getCommand(Command conmand) {
        this.command = conmand;
    }

    /**
     * 命令执行器
     */
    public void action() {
        command.execute();
    }
}
