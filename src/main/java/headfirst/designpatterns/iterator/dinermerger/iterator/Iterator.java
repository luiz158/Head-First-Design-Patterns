package headfirst.designpatterns.iterator.dinermerger.iterator;

import headfirst.designpatterns.iterator.dinermerger.MenuItem;

public interface Iterator {
    boolean hasNext();
    MenuItem next();
}
