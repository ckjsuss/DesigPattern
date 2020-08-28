package allpattern.action.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * person 管理类
 * @author Liu
 */
public class ObjectStructure {
    private List<Person> personList = new LinkedList<>();
    public void add(Person person){
        personList.add(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void display(Action action){
        personList.forEach(person -> person.accept(action));
    }
}
