package headfirst.designpatterns.combining._01adapter;

public class RubberDuck implements Quackable {
    public void quack() {
        System.out.println("Squeak");
    }
}
