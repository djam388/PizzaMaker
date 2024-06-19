package Builder;
import Pizza.*;

class ThickCrustPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    @Override
    public void buildDough() {
        pizza = new BasicPizza("thick");
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
