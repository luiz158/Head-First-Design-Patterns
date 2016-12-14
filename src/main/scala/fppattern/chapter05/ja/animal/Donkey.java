package fppattern.chapter05.ja.animal;

import fppattern.chapter05.ja.animal.features.GoodsMover;
import fppattern.chapter05.ja.animal.features.NameIt;
import fppattern.chapter05.ja.animal.features.Walks;

public class Donkey implements Walks, GoodsMover, NameIt {
    public void walk() {
        ProcessIt.walk(this);
    }
    public void moveGoods() {
        ProcessIt.moveGoods(this);
    }
    public String name() {
        return "Donkey";
    }
}

