package headfirst.designpatterns.iterator.dinermergercafe.aggregate;

import headfirst.designpatterns.iterator.dinermergercafe.MenuItem;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
