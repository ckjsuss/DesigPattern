package allpattern.action.visitor;

/**
 * @author Liu
 */
public abstract class Person {
    public String Name;
    public abstract void accept(Action action);

    public String getName() {
        return Name;
    }
}
