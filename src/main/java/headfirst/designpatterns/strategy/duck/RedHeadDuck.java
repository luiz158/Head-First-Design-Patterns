package headfirst.designpatterns.strategy.duck;

import headfirst.designpatterns.strategy.behavior.fly.FlyWithWings;
import headfirst.designpatterns.strategy.behavior.quack.Quack;

public class RedHeadDuck extends Duck {
 
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
 
    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
