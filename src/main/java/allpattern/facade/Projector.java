package allpattern.facade;

/**
 * 投影仪 设备
 * @author Liu
 */
public class Projector {
    private static Projector instance = new Projector();

    private Projector() {}

    public static Projector getInstance(){
        return instance;
    }

    public void On(){
        System.out.println("Projector ON!");
    }

    public void Off(){
        System.out.println("Projector OFF!");
    }

    public void Focus(){
        System.out.println("Projector Focus!");
    }

    public void Play(){
        System.out.println("Projector Play!");
    }
}
