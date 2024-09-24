import java.util.ArrayList;

public class PizzaMenu {
    private ArrayList<Pizza> pizzaer;

    public PizzaMenu() {
        pizzaer = new ArrayList<>();
    }

    public String getPizzaer() {
        String s = "";
        for (Pizza pizza : pizzaer){
            s += pizza.getTitel() + " " + pizza.getSovs() + " " + pizza.getToppings() + "\n";
        }
        return s;
    }

    public void addPizza(Pizza pizza){
        pizzaer.add(pizza);
    }
}
