package Factory;

import Decorator.BlueCheeseDecorator;
import Decorator.CheddarDecorator;
import Decorator.MozzarellaDecorator;
import Decorator.ParmesanDecorator;
import Pizza.Pizza;
import Pizza.BasicPizza;


public class FourCheesePizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String dough) {
        Pizza pizza = new BasicPizza(dough);
        pizza = new MozzarellaDecorator(pizza);
        pizza = new CheddarDecorator(pizza);
        pizza = new ParmesanDecorator(pizza);
        pizza = new BlueCheeseDecorator(pizza);
        return pizza;
    }
}
