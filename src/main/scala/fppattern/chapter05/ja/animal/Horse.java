package fppattern.chapter05.ja.animal;

import fppattern.chapter05.ja.animal.features.NameIt;
import fppattern.chapter05.ja.animal.features.Walks;

public class Horse extends Animal implements Walks, NameIt {
    public void walk() {
        ProcessIt.walk(this);
    }
    public String name() {
        return "Horse";
    }
}

