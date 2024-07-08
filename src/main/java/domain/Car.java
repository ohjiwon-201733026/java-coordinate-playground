package domain;

public abstract class Car {

    String report() {
        return getName() + " : " + getChargeQuantity() +"리터";
    }

    /**
     * 리터당 이동 거리. 즉, 연비
     */
    abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    abstract double getTripDistance();

    /**
     * 차종의 이름
     */
    String getName() {
        return this.getClass().getSimpleName();
    }

    /**
     * 주입해야할 연료량을 구한다.
     */
    int getChargeQuantity() {
        return (int)Math.ceil(getTripDistance() / getDistancePerLiter());
    }

}
