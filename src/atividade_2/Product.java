package atividade_2;

public class Product {
    private String name;
    private String type;
    private double rentalFee;

    public Product(String name, String type, double rentalFee) {
        this.name = name;
        this.type = type;
        this.rentalFee = rentalFee;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getRentalFee() {
        return rentalFee;
    }

    public void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Type: " + type);
        System.out.println("Rental Fee: " + rentalFee + " reais");
    }
}
