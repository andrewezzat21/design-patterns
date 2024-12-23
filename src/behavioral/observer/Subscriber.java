package behavioral.observer;

public class Subscriber implements Observer {

    int updatedNumber;

    @Override
    public void update(Subject subject) {
        this.setUpdatedNumber(subject.getData());
    }

    public int getUpdatedNumber() {
        return updatedNumber;
    }

    public void setUpdatedNumber(int updatedNumber) {
        this.updatedNumber = updatedNumber;
    }
}
