package dependency_inversion_plus;

public class Person {
    public void receive(App app){
        System.out.println(app.getInfo());
    }
}
