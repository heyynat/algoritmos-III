package atividade_7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CellPhone> cellPhones = new ArrayList<>();

        CellPhone basicPhone = new CellPhone("Nokia", "3310", 50.0);
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21", 899.99, true);

        cellPhones.add(basicPhone);
        cellPhones.add(smartphone);

        for (CellPhone phone : cellPhones) {
            phone.operate();
        }
    }
}
