package headfirst.designpatterns.decorator.starbuzz.condiment;

import headfirst.designpatterns.decorator.starbuzz.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
