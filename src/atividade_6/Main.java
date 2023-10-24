package atividade_6;

public class Main {
    public static void main(String[] args) {
        CellPhone basicPhone = new CellPhone("Nokia", "3310", 50.0);
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21", 899.99, true);

        System.out.println("Basic Phone: " + basicPhone);
        System.out.println("Smartphone: " + smartphone);

        if (smartphone.hasWiFi()) {
            smartphone.chargeWirelessly();
        } else {
            System.out.println("This smartphone does not support wireless charging.");
        }
    }
}
