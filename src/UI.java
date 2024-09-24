import java.util.Scanner;

public class UI {
    private Controller cont;

    public UI (Controller controller){
        this.cont = controller;
    }

    public void displayMenu() {
        System.out.println("Velkommen til dit Pizzaria. \nVælg mellem følgende 3 valg");
        boolean køre = false;
        Pizza pizza;

        while (!køre) {
            System.out.println("1: Vis Menu \n2: Tilføj Pizza \n3: Exit");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            switch (x) {
                case 1 -> System.out.println(cont.getPizzaer());

                case 2 -> {
                    boolean t = false;
                    while (!t) {
                        String titel = "";
                        String sovs = "";
                        String toppings = "";
                        System.out.print("Navn på pizza: ");
                        titel = sc.next();
                        System.out.print("\nSovs: ");
                        sovs = sc.next();
                        System.out.print("\nToppings: ");
                        toppings = sc.next();
                        pizza = new Pizza(titel, sovs, toppings);
                        cont.addPizza(pizza);

                        System.out.println("\nVil du tilføje en ny pizza?");
                        Scanner sc1 = new Scanner(System.in);
                        String nyPizza = "";
                        nyPizza = sc1.next();
                        if (nyPizza.equalsIgnoreCase("nej")) {
                            t = true;
                        }
                    }
                }

                case 3 -> køre = true;

            }
        }
    }
}
