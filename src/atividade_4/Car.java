package atividade_4;

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, double price, int numberOfDoors) {
        super(make, model, year, price);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void turnOnHeadlights() {
        System.out.println("The car's headlights are turned on.");
    }
}