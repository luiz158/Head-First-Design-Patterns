package headfirst.designpatterns.factory.pizza_abstract_factory.factory;

import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.cheese.Cheese;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.clams.Clams;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.dough.Dough;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.sauce.Sauce;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.veggies.Veggies;

public interface PizzaIngredientFactory {
 
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
 
}
