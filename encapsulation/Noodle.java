package encapsulation;

class Noodle {
    // variable has to be set to private
    private String brand;
    private String flavor;
    private int price;

    public Noodle(String brand, String flavor, int price) {
        this.brand = brand;
        this.flavor = flavor;
        this.price = price;
    }

    // setter for changing 'flavor' variable
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    // getter for reading 'flavor' data
    public String getFlavor() {
        return flavor;
    }

    public void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price input!");
        }
    }

    public int getPrice() {
        return price;
    }
}