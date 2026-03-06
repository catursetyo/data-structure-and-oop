public class Car {
    //attribute
    private String brand;
    private String color;
    private String type;
    private int speed;

    //constructor
    public Car() {
    }

    public Car(String brand, String color, String type, int speed) {
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.speed = speed;
    }

    //method
    public void acc(int speedInc) {
    }

    // public String getBrand() {
    //     return "brand: " + brand + "\n";
    // }

    // public String getColor() {
    //     return "color: " + color + "\n";
    // }

    // public String getType() {
    //     return "type: " + type + "\n";
    // }

    // public String getSpeed() {
    //     return "speed: " + speed;
    // }

    // public String getInfo() {
    //     return getBrand() + getColor() + getType() + getSpeed();
    // }

    public String getInfo() {
        return "brand: " + brand + "\n" + "color: " + color + "\n" + "type: " + type + "\n" + "speed: " + speed;
    }
}