public class Pizza {
    private String titel;
    private String sovs;
    private String toppings;

    public Pizza(String titel, String sovs, String toppings) {
        this.titel = titel;
        this.sovs = sovs;
        this.toppings = toppings;
    }

    public String getSovs() {
        return sovs;
    }

    public String getTitel() {
        return titel;
    }

    public String getToppings() {
        return toppings;
    }
}
