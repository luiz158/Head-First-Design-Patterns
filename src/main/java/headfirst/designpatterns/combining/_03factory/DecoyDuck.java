package headfirst.designpatterns.combining._03factory;

public class DecoyDuck implements Quackable {
 
    public void quack() {
        System.out.println("<< Silence >>");
    }
 
    public String toString() {
        return "Decoy Duck";
    }
}
