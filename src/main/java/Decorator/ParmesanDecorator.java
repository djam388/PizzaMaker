package Decorator;
import Pizza.Pizza;

public class ParmesanDecorator extends PizzaDecorator {
    public ParmesanDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Parmesan";
    }
}
