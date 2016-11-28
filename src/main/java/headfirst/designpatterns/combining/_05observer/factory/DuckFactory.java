package headfirst.designpatterns.combining._05observer.factory;

import headfirst.designpatterns.combining._05observer.duck.*;

public class DuckFactory extends AbstractDuckFactory {
  
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }
  
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }
  
    public Quackable createDuckCall() {
        return new DuckCall();
    }
   
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
