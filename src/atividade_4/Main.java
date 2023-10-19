package atividade_4;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Ford", "Fiesta", 2022, 35000.0, 4);
        Motorcycle myMotorcycle = new Motorcycle("Honda", "CBR500R", 2021, 8000.0, true);

        System.out.println("My car is a " + myCar.getMake() + " " + myCar.getModel());
        System.out.println("It has " + myCar.getNumberOfDoors() + " doors.");
        myCar.accelerate();
        myCar.turnOnHeadlights();

        System.out.println("\nMy motorcycle is a " + myMotorcycle.getMake() + " " + myMotorcycle.getModel());
        System.out.println("Has electric start: " + myMotorcycle.hasElectricStart());
        myMotorcycle.accelerate();
        myMotorcycle.wheelie();
    }
}
