package allpattern.action.command;

/**
 * @author Liu
 */
public class CommandClient {
    public static void main(String[] args) {
        System.out.println("命令:需求");
        Command requireCommand = new RequireCommand();
        Invoker invoker = new Invoker();
        invoker.getCommand(requireCommand);
        invoker.action();
        System.out.println("=======================");
        System.out.println("命令:编码");
        Command codeCommand = new CodeCommand();
        Invoker invoker1 = new Invoker();
        invoker1.getCommand(codeCommand);
        invoker1.action();
        System.out.println("=======================");
        System.out.println("命令:前端编码");
        Command uiCommand = new UiCommand();
        Invoker invoker2 = new Invoker();
        invoker2.getCommand(uiCommand);
        invoker2.action();
    }
}
