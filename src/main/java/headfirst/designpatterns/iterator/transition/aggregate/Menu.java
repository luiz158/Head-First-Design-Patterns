package headfirst.designpatterns.iterator.transition.aggregate;

import java.util.Iterator;

public interface Menu {
    public Iterator<?> createIterator();
}
