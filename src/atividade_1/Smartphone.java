package atividade_1;

public class Smartphone {
    public String name;
    public String made_in;
    public String brand;
    
    public Smartphone(String name, String made_in, String brand) {
        this.name = name;
        this.made_in = made_in;
        this.brand = brand;
    }

    public void showInformation() {
        System.out.println("Name: " + name);
        System.out.println("Made In: " + made_in);
        System.out.println("Brand: " + brand);
    }
}
