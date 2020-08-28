package allpattern.action.visitor;

/**
 * @author Liu
 */
public class Man extends Person {

    public Man(String name) {
        super.Name = name;
    }

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }

}
