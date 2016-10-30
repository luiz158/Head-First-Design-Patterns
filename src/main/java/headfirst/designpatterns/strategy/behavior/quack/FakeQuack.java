package headfirst.designpatterns.strategy.behavior.quack;

public class FakeQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Qwak");
    }
}
