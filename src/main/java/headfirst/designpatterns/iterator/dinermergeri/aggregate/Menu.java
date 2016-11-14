package headfirst.designpatterns.iterator.dinermergeri.aggregate;

import headfirst.designpatterns.iterator.dinermergeri.MenuItem;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
