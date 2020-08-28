package allpattern.action.chain;

/**
 * 审批人员的抽象父类
 * @author Liu
 */
public abstract class Handler {
    protected Handler successor;

    public abstract boolean handler(int fee);

    public abstract void setSuccessor(Handler successor);

    public abstract Handler getSuccessot();
}
