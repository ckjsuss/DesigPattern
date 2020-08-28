package allpattern.action.observer;

/**
 * @author Liu
 */
public class CurrentConditons implements Observer{
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
        System.out.println("CurrentConditons temperature : "+ temperature);
        System.out.println("CurrentConditons pressure : "+ pressure);
        System.out.println("CurrentConditons humidity : "+ humidity);
    }

}
