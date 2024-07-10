package grid.domain;

import java.util.List;

public class Triangle extends Figure {


    public Triangle(List<Point> points) {
        this.points = points;
    }
    @Override
    public double getArea() {
        Point p1 = points.get(0);
        Point p2 = points.get(1);
        Point p3 = points.get(2);

        Double a = Math.sqrt((p1.getX() - p2.getX()) * (p1.getX() - p2.getX()) + (p1.getY() - p2.getY()) * (p1.getY() - p2.getY()));
        Double b = Math.sqrt((p2.getX() - p3.getX()) * (p2.getX() - p3.getX()) + (p2.getY() - p3.getY()) * (p2.getY() - p3.getY()));
        Double c = Math.sqrt((p1.getX() - p3.getX()) * (p1.getX() - p3.getX()) + (p1.getY() - p3.getY()) * (p1.getY() - p3.getY()));
        return (a + b + c) / 2;
    }

    @Override
    public boolean isFigure() {
        return points.size() == 3;
    }
}
