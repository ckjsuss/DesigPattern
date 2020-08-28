package allpattern.action.visitor;

/**
 * @author Liu
 */
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("Man "+ man.getName()+":  Success!");
    }

    @Override
    public void getWoManResult(Woman woman) {
        System.out.println("WoMan "+ woman.getName()+":  Success!");
    }
}
