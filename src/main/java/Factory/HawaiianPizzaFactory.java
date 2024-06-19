package Factory;
import Decorator.CheeseDecorator;
import Decorator.PepperoniDecorator;
import Pizza.*;
public class HawaiianPizzaFactory implements PizzaFactory {
    @Override
    public Pizza createPizza(String dough) {
        Pizza pizza = new BasicPizza(dough);
        pizza = new CheeseDecorator(pizza);
        pizza = new PepperoniDecorator(pizza);
        return pizza;
    }
}
