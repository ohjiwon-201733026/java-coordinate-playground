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
        return 0;
    }

    @Override
    public boolean isFigure() {
        this.sort();
        Point a = points.get(0);
        Point b = points.get(1);
        Point c = points.get(2);
        Point d = points.get(3);
        return a.getX() == b.getX() && c.getX() == d.getX() && a.getY() == c.getY() && b.getY() == d.getY();
    }

    public void sort() {
        this.points.sort(Comparator.comparingInt(Point::getX)
                .thenComparing(Point::getY));
    }
}
