package allpattern.action.observer;

import java.util.ArrayList;

/**
 * @author Liu
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<Observer> observers;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    public void setDate(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dataChange();
    }

    private void dataChange(){
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removerObserver(Observer oberver) {
        if (observers.contains(oberver)) {
            observers.remove(oberver);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(this.temperature, this.pressure, this.humidity));
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
