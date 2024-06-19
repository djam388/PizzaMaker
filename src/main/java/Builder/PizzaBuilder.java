package Builder;
import Pizza.Pizza;

public interface PizzaBuilder {
    void buildDough();
    void buildIngredients();
    Pizza getPizza();
}
