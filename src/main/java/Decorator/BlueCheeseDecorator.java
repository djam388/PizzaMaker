package Decorator;
import Pizza.Pizza;

public class BlueCheeseDecorator extends PizzaDecorator {
    public BlueCheeseDecorator(Pizza pizza) {
        super(pizza); // Вызов конструктора суперкласса
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Blue Cheese";
    }
}
