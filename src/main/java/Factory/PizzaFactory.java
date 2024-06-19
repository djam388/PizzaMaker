package Factory;
import Pizza.Pizza;

public interface PizzaFactory {
    Pizza createPizza(String dough);
}
