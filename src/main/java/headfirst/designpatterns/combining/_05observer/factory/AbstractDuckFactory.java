package headfirst.designpatterns.combining._05observer.factory;

import headfirst.designpatterns.combining._05observer.duck.Quackable;

public abstract class AbstractDuckFactory {
 
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedheadDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
