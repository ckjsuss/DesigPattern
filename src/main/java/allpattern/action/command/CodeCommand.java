package allpattern.action.command;

/**
 * 编码命令接收者
 * @author Liu
 */
public class CodeCommand extends Command{
    private Code code = new Code();

    @Override
    public void execute() {
        code.find();
        code.add();
    }
}
