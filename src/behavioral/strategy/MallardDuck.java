package behavioral.strategy;

import behavioral.strategy.fly.FlyWithWings;
import behavioral.strategy.quack.QuackSound;

public class MallardDuck extends Duck {


    public MallardDuck(){
        quackBehavior = new QuackSound();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("I'm a real Mallard duck");
    }



}
