package headfirst.designpatterns.factory.pizza_abstract_factory.factory;

import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.cheese.Cheese;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.cheese.MozzarellaCheese;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.clams.Clams;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.clams.FrozenClams;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.dough.Dough;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.dough.ThickCrustDough;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.pepperoni.Pepperoni;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.pepperoni.SlicedPepperoni;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.sauce.PlumTomatoSauce;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.sauce.Sauce;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.veggies.BlackOlives;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.veggies.Eggplant;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.veggies.Spinach;
import headfirst.designpatterns.factory.pizza_abstract_factory.ingredient.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(),
                new Spinach(),
                new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
