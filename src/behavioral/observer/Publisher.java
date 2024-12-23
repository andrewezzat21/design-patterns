package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject{

    List<Observer> observers;
    int number;

    public Publisher(int number) {
        this.number = number;
        observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getData(){
        return this.getNumber();
    }
}
