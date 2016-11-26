package headfirst.designpatterns.combining._05observer.duck;

import headfirst.designpatterns.combining._05observer.observer.Observable;
import headfirst.designpatterns.combining._05observer.observer.Observer;

public class MallardDuck implements Quackable {
    Observable observable;
 
    public MallardDuck() {
        observable = new Observable(this);
    }
 
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }
 
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }
 
    public void notifyObservers() {
        observable.notifyObservers();
    }
 
    public String toString() {
        return "Mallard Duck";
    }
}
