package behavioral.strategy.quack;

public class QuackSound implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack Sound");
    }
}
