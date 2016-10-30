package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.behavior.fly.FlyNoWay;
import headfirst.designpatterns.strategy.behavior.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    public void display() {
        System.out.println("I'm a duck Decoy");
    }
}
