package headfirst.designpatterns.iterator.dinermerger.aggregate;

import headfirst.designpatterns.iterator.dinermerger.iterator.Iterator;

public interface Menu {
    public Iterator createIterator();
}
