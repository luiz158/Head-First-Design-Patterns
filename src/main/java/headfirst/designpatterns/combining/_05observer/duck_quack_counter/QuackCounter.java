package headfirst.designpatterns.combining._05observer.duck_quack_counter;

import headfirst.designpatterns.combining._05observer.observer.Observer;
import headfirst.designpatterns.combining._05observer.duck.Quackable;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;
  
    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }
  
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }
 
    public static int getQuacks() {
        return numberOfQuacks;
    }
 
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }
 
    public void notifyObservers() {
        duck.notifyObservers();
    }
   
    public String toString() {
        return duck.toString();
    }
}
