package headfirst.designpatterns.combining._05observer.factory;

import headfirst.designpatterns.combining._05observer.duck_quack_counter.QuackCounter;
import headfirst.designpatterns.combining._05observer.duck.*;

public class CountingDuckFactory extends AbstractDuckFactory {
  
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }
  
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }
  
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }
   
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
