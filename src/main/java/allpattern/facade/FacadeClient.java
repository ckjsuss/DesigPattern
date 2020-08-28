package allpattern.facade;

/**
 * 调用者
 * @author Liu
 */
public class FacadeClient {
    public static void main(String[] args){
        CinemaFacade cinemaFacade = new CinemaFacade();
        cinemaFacade.init();
        cinemaFacade.play();
        cinemaFacade.end();
    }
}
