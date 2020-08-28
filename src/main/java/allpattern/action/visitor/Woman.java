package allpattern.action.visitor;

/**
 * 双分派问题；
 *  （第一次分派）：
 *      客户端将具体状态作为参数创意Woman 中
 *  （第二次分派）：
 *      Woman类调用作为参数的“具体方法”，中方法getWoManResult，将自己（this） 作为参数传入
 * @author Liu
 */
public class Woman extends Person {
    public Woman(String name) {
        super.Name = name;
    }
    @Override
    public void accept(Action action) {
        action.getWoManResult(this);
    }
}
