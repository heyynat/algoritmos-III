package atividade_7;

public class CellPhone {
    private String brand;
    private String model;
    private double price;

    public CellPhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return brand + " " + model + " - Price: $" + price;
    }

    public void operate() {
        System.out.println("Operating a generic cell phone.");
    }
}
