package inheritance;

class Noodle { // parent class
    protected String brand;
    protected String flavor;
    protected int price;

    // constructor
    public Noodle(String brand, String flavor, int price) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    public void cook() {
        System.out.println("Cooking noodle...");
    }
}

// first child class
class Gacoan extends Noodle {
    
    public Gacoan(String brand, String flavor, int price) {
        super(brand, flavor, price); // super() used to call the constructor Noodle() 
    }

    // override the cook() method in parent class
    @Override
    public void cook() {
        System.out.println("Cooking Gacoan lv.6 with " + flavor + " flavor");
    }
}

// second child class
class Spaghetti extends Noodle {

    public Spaghetti(String brand, String flavor, int price) {
        super(brand, flavor, price); 
    }

    @Override
    public void cook() {
        System.out.println("Cooking spaghetti for $ " + price);
    }
}

