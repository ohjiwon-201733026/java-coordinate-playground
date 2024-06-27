package domain;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

    private static final String NEWLINE = System.getProperty("line.separator");

    private List<Car> cars;

    public RentCompany() {
        cars = new ArrayList<>();
    }

    public static RentCompany create() {
        RentCompany rentCompany = new RentCompany();

        return rentCompany;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public String generateReport() {
        StringBuilder report = new StringBuilder();
        cars.forEach(car -> report.append(car.report()).append(NEWLINE));

        return report.toString();
    }
}
