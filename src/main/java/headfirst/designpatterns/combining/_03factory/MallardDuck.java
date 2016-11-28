package headfirst.designpatterns.combining._03factory;

public class MallardDuck implements Quackable {
 
    public void quack() {
        System.out.println("Quack");
    }
 
    public String toString() {
        return "Mallard Duck";
    }
}
