package behavioral.observer;

public interface Subject {

    public void subscribe(Observer observer);
    public void unsubscribe(Observer observer);
    public void notifyObservers();
    public int getData();

}
