package encapsulation;

public class Main {
    public static void main(String[] args) throws Exception {

        Noodle indomie = new Noodle("indomie", "rendang", 3000);

        // change flavor and price using setter
        indomie.setFlavor("matcha");
        indomie.setPrice(1500);

        System.out.println("Flavor: " + indomie.getFlavor() + "\n" + "Price: " + indomie.getPrice());
    }
}
