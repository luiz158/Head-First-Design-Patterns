package headfirst.designpatterns.combining._05observer.duck;

import headfirst.designpatterns.combining._05observer.observer.Observable;
import headfirst.designpatterns.combining._05observer.observer.Observer;

public class RubberDuck implements Quackable {
    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }
 
    public void quack() {
        System.out.println("Squeak");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }
  
    public String toString() {
        return "Rubber Duck";
    }
}
