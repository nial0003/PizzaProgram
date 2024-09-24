public class Controller {
    PizzaMenu menu = new PizzaMenu();

    public String getPizzaer(){
        return menu.getPizzaer();
    }

    public void addPizza(Pizza pizza){
        menu.addPizza(pizza);
    }
}
