import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller cont = new Controller();
        UI ui = new UI(cont);
        ui.displayMenu();
    }
}