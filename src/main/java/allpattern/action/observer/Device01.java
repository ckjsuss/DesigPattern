package allpattern.action.observer;

/**
 * @author Liu
 */
public class Device01 implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("Device01 temperature : "+ temperature);
        System.out.println("Device01 pressure : "+ pressure);
        System.out.println("Device01 humidity : "+ humidity);
    }

}
