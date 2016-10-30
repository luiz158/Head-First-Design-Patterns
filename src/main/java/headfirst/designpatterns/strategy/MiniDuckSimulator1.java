package headfirst.designpatterns.strategy;

import headfirst.designpatterns.strategy.behavior.fly.FlyRocketPowered;
import headfirst.designpatterns.strategy.duck.Duck;
import headfirst.designpatterns.strategy.duck.MallardDuck;
import headfirst.designpatterns.strategy.duck.ModelDuck;

public class MiniDuckSimulator1 {
 
    public static void main(String[] args) {
 
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
   
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}
