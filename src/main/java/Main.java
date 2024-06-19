import Builder.PizzaBuilder;
import Builder.PizzaDirector;
import Builder.ThinCrustPizzaBuilder;
import Decorator.CheeseDecorator;
import Decorator.PepperoniDecorator;
import Factory.FourCheesePizzaFactory;
import Factory.HawaiianPizzaFactory;
import Factory.PizzaFactory;
import Pizza.Pizza;

public class Main {
    public static void main(String[] args) {

        PizzaFactory fourCheesePizzaFactory = new FourCheesePizzaFactory();
        PizzaFactory hawaiianPizzaFactory = new HawaiianPizzaFactory();
        Pizza fourCheesePizzaThin = fourCheesePizzaFactory.createPizza("thin");
        Pizza hawaiianPizzaThick = hawaiianPizzaFactory.createPizza("thick");
        System.out.println("Menu Pizza (Four Cheese, Thin): " + fourCheesePizzaThin.getDescription());
        System.out.println("Menu Pizza (Hawaiian, Thick): " + hawaiianPizzaThick.getDescription());

        PizzaBuilder thinCrustBuilder = new ThinCrustPizzaBuilder();
        PizzaDirector director = new PizzaDirector();
        director.setPizzaBuilder(thinCrustBuilder);
        director.constructPizza();
        Pizza customPizza = director.getPizza();
        customPizza = new CheeseDecorator(customPizza);
        customPizza = new PepperoniDecorator(customPizza);
        System.out.println("Custom Pizza: " + customPizza.getDescription());
    }
}
