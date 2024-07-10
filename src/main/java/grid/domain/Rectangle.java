package grid.domain;

import java.util.Comparator;
import java.util.List;

public class Rectangle extends Figure{

    public Rectangle(List<Point> points) {
        if(points.size() < 4)
            throw new IllegalArgumentException("Rectangle must have at least 4 points");
        this.points = points;
        if (!isFigure()) throw new IllegalArgumentException("Figure must be a rectangle");
    }

    @Override
    public double getArea() {
        this.sort();
        Point p1 = points.get(0);
        Point p2 = points.get(1);
        Point p3 = points.get(2);
        return (p2.getY() - p1.getY()) * (p3.getX() - p1.getX());
    }

    @Override
    public boolean isFigure() {
        this.sort();
        Point p1 = points.get(0);
        Point p2 = points.get(1);
        Point p3 = points.get(2);
        Point p4 = points.get(3);
        return p1.getX() == p2.getX() && p3.getX() == p4.getX() && p1.getY() == p3.getY() && p2.getY() == p4.getY();
    }

    public void sort() {
        this.points.sort(Comparator.comparingInt(Point::getX)
                .thenComparing(Point::getY));
    }
}
