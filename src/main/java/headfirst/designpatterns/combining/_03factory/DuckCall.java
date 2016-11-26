package headfirst.designpatterns.combining._03factory;

public class DuckCall implements Quackable {
 
    public void quack() {
        System.out.println("Kwak");
    }
 
    public String toString() {
        return "Duck Call";
    }
}
