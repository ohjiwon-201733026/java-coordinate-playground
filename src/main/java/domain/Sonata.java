package domain;

public class Sonata extends Car{

    private final int tripDistance;

    public Sonata(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public String report() {
        return "Sonata : " + getChargeQuantity() + "리터";
    }

    @Override
    double getDistancePerLiter() {
        return 10;
    }

    @Override
    double getTripDistance() {
        return this.tripDistance;
    }
}
