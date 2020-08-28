package allpattern.facade;

/**
 * 灯
 * @author Liu
 */
public class Light {
    private static Light instance = new Light();

    private Light() {}

    public static Light getInstance(){
        return instance;
    }

    public void On(){
        System.out.println("Light ON!");
    }

    public void Off(){
        System.out.println("Light OFF!");
    }

    public void bright(){
        System.out.println("Light bright!");
    }
}
