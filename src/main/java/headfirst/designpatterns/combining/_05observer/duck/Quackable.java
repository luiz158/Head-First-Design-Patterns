package headfirst.designpatterns.combining._05observer.duck;

import headfirst.designpatterns.combining._05observer.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    public void quack();
}
