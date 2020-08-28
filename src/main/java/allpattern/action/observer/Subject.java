package allpattern.action.observer;

/**
 * @author Liu
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removerObserver(Observer oberver);
    void notifyObservers();
}
