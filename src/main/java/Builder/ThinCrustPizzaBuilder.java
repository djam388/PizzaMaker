package Builder;
import Pizza.*;

public class ThinCrustPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    @Override
    public void buildDough() {
        pizza = new BasicPizza("thin");
    }

    @Override
    public void buildIngredients() {
        // по умолчанию добавляем базовые ингредиенты
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
