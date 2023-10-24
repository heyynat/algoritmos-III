package atividade_7;

public class Smartphone extends CellPhone implements WirelessCharging {
    private boolean hasWiFi;

    public Smartphone(String brand, String model, double price, boolean hasWiFi) {
        super(brand, model, price);
        this.hasWiFi = hasWiFi;
    }

    public boolean hasWiFi() {
        return hasWiFi;
    }

    public void setHasWiFi(boolean hasWiFi) {
        this.hasWiFi = hasWiFi;
    }

    @Override
    public void chargeWirelessly() {
        System.out.println("Charging your " + getBrand() + " " + getModel() + " wirelessly.");
    }

    @Override
    public void operate() {
        System.out.println("Operating a smartphone.");
    }
}
