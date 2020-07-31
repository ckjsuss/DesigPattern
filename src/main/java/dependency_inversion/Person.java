package dependency_inversion;

public class Person {
    public void receive(Email email){
        System.out.println(email.getInfo());
    }

    public void receive(Wechat wechat){
        System.out.println(wechat.getInfo());
    }
    public void receive(Emessage emessage){
        System.out.println(emessage.getInfo());
    }
    // Person类receive方法的也在膨胀（问题）...
}
