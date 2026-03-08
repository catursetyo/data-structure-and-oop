package abstraction;

abstract class Noodle {
    protected String brand;
    protected int price;

    public Noodle(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    // abstract method
    public abstract void cook();

    public void displayInfo() {
        System.out.println("Brand: " + brand + " - $" + price);
    }
}

class Gacoan extends Noodle {
    private String topping;

    public Gacoan(String brand, int price, String topping) {
        super(brand, price);
        this.topping = topping;
    }

    // child class HAS TO override abstract method from parent class
    @Override
    public void cook() {
        System.out.println("Cooking gacoan with " + topping + "...");
    }
}