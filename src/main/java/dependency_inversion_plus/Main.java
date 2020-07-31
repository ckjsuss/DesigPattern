package dependency_inversion_plus;

public class Main {
    public static void main(String[] args){
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Wechat());
        person.receive(new Emessage());
    }
}
