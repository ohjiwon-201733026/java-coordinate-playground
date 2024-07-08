package domain;

public class Avante extends Car{

    private final int tripDistance;

    public Avante(int tripDistance) {
        this.tripDistance = tripDistance;
    }

    @Override
    public String report() {
        return "Avante : " + getChargeQuantity() +"리터";
    }

    @Override
    double getDistancePerLiter() {
        return 15;
    }

    @Override
    double getTripDistance() {
        return this.tripDistance;
    }

}
