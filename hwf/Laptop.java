package hwf;
public class Laptop {
    private String brand;
    private String model;
    private double price;
    private int ram;
    private int storage;
    private String color;

    public Laptop(String brand, String model, double price, int ram, int storage, String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.storage = storage;
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", " + ram + "GB RAM, " + storage + "GB storage, $" + price + ", " + color;
    }
}


