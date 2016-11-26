package headfirst.designpatterns.combining._05observer.duck;

import headfirst.designpatterns.combining._05observer.observer.Observable;
import headfirst.designpatterns.combining._05observer.observer.Observer;

public class DecoyDuck implements Quackable {
    Observable observable;

    public DecoyDuck() {
        observable = new Observable(this);
    }
 
    public void quack() {
        System.out.println("<< Silence >>");
        notifyObservers();
    }
 
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
 
    public String toString() {
        return "Decoy Duck";
    }
}
