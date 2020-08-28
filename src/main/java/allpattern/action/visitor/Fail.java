package allpattern.action.visitor;

/**
 * @author Liu
 */
public class Fail extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("Man "+ man.getName()+":  Fail!");
    }

    @Override
    public void getWoManResult(Woman woman) {
        System.out.println("WoMan "+ woman.getName()+":  Fail!");
    }
}
