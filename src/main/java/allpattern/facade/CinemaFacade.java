package allpattern.facade;

/**
 * 影院（外观）
 *
 * @author Liu
 */
public class CinemaFacade {
    private Light light;

    private Projector projector;

    private Screen screen;

    public CinemaFacade() {
        this.light = Light.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
    }

    public void init(){
        System.out.println("影院初始化......");
        light.On();
        screen.On();
        screen.Down();
        projector.On();
        projector.Focus();
    }

    public void play(){
        System.out.println("播放电影......");
        light.Off();
        projector.Play();
    }

    public void end(){
        System.out.println("播放结束......");
        light.On();
        projector.Off();
        screen.Up();
        screen.Off();
    }

}
