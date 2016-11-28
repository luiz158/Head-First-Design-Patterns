package headfirst.designpatterns.combining._01adapter;

public class DecoyDuck implements Quackable {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
