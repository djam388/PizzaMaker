package Decorator;
import Pizza.Pizza;

public class CheddarDecorator extends PizzaDecorator {
    public CheddarDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Cheddar";
    }
}
