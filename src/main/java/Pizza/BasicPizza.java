package Pizza;

public class BasicPizza implements Pizza {
    private String dough;

    public BasicPizza(String dough) {
        this.dough = dough;
    }

    @Override
    public String getDescription() {
        return "Pizza with " + dough + " dough";
    }
}
