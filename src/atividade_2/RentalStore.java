package atividade_2;

import java.util.ArrayList;
import java.util.List;

public class RentalStore {
    private List<Product> productCollection;

    public RentalStore() {
        productCollection = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productCollection.add(product);
    }

    public void displayProducts() {
        System.out.println("Products available for rent:");
        for (Product product : productCollection) {
            product.displayDetails();
            System.out.println("--------------------");
        }
    }

    public static void main(String[] args) {
        RentalStore rentalStore = new RentalStore();

        Product product1 = new Product("Gaming Console", "Electronics", 50.0);
        Product product2 = new Product("Mountain Bike", "Outdoor Gear", 30.0);

        rentalStore.addProduct(product1);
        rentalStore.addProduct(product2);

        rentalStore.displayProducts();
    }
}
