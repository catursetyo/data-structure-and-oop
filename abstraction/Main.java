package abstraction;

public class Main {
    public static void main(String[] args) throws Exception {
        Gacoan jaki = new Gacoan("gacoan", 150, "pepperoni");

        jaki.displayInfo();
        jaki.cook();
    }
}
