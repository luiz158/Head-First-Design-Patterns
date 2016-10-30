package headfirst.designpatterns.strategy.behavior.quack;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
