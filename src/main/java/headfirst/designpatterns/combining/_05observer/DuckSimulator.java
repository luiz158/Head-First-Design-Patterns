package headfirst.designpatterns.combining._05observer;

import headfirst.designpatterns.combining._05observer.duck.Quackable;
import headfirst.designpatterns.combining._05observer.duck_quack_counter.QuackCounter;
import headfirst.designpatterns.combining._05observer.factory.AbstractDuckFactory;
import headfirst.designpatterns.combining._05observer.factory.CountingDuckFactory;
import headfirst.designpatterns.combining._05observer.flock.Flock;
import headfirst.designpatterns.combining._05observer.googse.Goose;
import headfirst.designpatterns.combining._05observer.googse.GooseAdapter;
import headfirst.designpatterns.combining._05observer.observer.Quackologist;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
 
        simulator.simulate(duckFactory);
    }
  
    void simulate(AbstractDuckFactory duckFactory) {
  
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
 
        Flock flockOfDucks = new Flock();
 
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
 
        Flock flockOfMallards = new Flock();
 
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nDuck Simulator: With Observer");

        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);

        simulate(flockOfDucks);

        System.out.println("\nThe ducks quacked " +
                           QuackCounter.getQuacks() +
                           " times");
    }
 
    void simulate(Quackable duck) {
        duck.quack();
    }
}
