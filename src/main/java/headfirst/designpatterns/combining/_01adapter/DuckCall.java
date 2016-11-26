package headfirst.designpatterns.combining._01adapter;

public class DuckCall implements Quackable {
    public void quack() {
        System.out.println("Kwak");
    }
}
