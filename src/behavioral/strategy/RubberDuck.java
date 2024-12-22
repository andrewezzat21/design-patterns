package behavioral.strategy;

import behavioral.strategy.fly.FlyNoWay;
import behavioral.strategy.quack.QuackMute;

public class RubberDuck extends Duck {


    public RubberDuck(){
        quackBehavior = new QuackMute();
        flyBehavior = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("Yellow Rubber Duck");
    }

}
