package allpattern.action.command;

/**
 * 需求命令接收者
 * @author Liu
 */
public class RequireCommand extends Command {
    private Require require = new Require();

    @Override
    public void execute() {
        require.find();
        require.add();
    }
}
