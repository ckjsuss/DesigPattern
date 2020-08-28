package allpattern.facade;

/**
 *  屏幕
 * @author Liu
 */
public class Screen {
    private static Screen screen = new Screen();

    private Screen(){}

    public static Screen getInstance(){
        return screen;
    }

    public void On(){
        System.out.println("Screen ON!");
    }

    public void Off(){
        System.out.println("Screen OFF!");
    }

    public void Up(){
        System.out.println("Screen Up!");
    }

    public void Down(){
        System.out.println("Screen Down!");
    }
}
