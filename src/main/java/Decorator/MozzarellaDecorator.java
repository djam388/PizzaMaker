package Decorator;
import Pizza.Pizza;

public class MozzarellaDecorator extends PizzaDecorator {
    public MozzarellaDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mozzarella";
    }
}
