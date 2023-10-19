package atividade_4;

class Motorcycle extends Vehicle {
    private boolean electricStart;

    public Motorcycle(String make, String model, int year, double price, boolean electricStart) {
        super(make, model, year, price);
        this.electricStart = electricStart;
    }

    public boolean hasElectricStart() {
        return electricStart;
    }

    public void setElectricStart(boolean electricStart) {
        this.electricStart = electricStart;
    }

    public void wheelie() {
        System.out.println("The motorcycle is doing a wheelie.");
    }
}
