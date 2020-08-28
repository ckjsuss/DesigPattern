package allpattern.action.observer;

/**
 * @author Liu
 */
public class ObserverClient {
    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        Observer observer1 = new CurrentConditons();
        weatherData.registerObserver(observer1);
        Observer observer2 = new Device01();
        weatherData.registerObserver(observer2);
        System.out.println("===============通知各个注册的观察者=========");
        weatherData.setDate(25.12f, 100, 0.35f);
    }
}
