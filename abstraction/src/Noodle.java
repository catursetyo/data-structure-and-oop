abstract class Noodle {
    protected String brand;
    protected String color;

    public Noodle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    abstract void startEngine();
    
    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Color: " + color);
    }
}