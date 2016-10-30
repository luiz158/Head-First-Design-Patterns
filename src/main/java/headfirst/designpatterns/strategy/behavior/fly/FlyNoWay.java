package headfirst.designpatterns.strategy.behavior.fly;

import headfirst.designpatterns.strategy.behavior.fly.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
