package allpattern.action.command;

/**
 * 前端命令接收者
 * @author Liu
 */
public class UiCommand extends Command {

    private Ui ui = new Ui();

    @Override
    public void execute() {
        ui.find();
        ui.add();
    }
}
