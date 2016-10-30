package headfirst.designpatterns.strategy.behavior.fly;

import headfirst.designpatterns.strategy.behavior.fly.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
