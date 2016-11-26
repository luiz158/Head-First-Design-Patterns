package headfirst.designpatterns.combining._05observer.observer;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
