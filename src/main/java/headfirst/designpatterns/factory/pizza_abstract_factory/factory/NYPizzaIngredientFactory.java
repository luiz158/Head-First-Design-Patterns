package headfirst.designpatterns.factory.pizza_abstract_factory.factory;

import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.cheese.Cheese;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.cheese.ReggianoCheese;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.clams.Clams;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.clams.FreshClams;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.dough.Dough;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.dough.ThinCrustDough;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.pepperoni.SlicedPepperoni;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.sauce.MarinaraSauce;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.sauce.Sauce;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
    public Dough createDough() {
        return new ThinCrustDough();
    }
 
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
 
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
 
    public Veggies[] createVeggies() {
        Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
        return veggies;
    }
 
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
