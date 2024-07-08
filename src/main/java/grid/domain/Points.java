package grid.domain;

import java.util.List;

public class Points extends Figure{

    public Points(List<Point> points) {
        this.points = points;
    }

    @Override
    public double getArea() {
        int x1 = points.get(0).getX();
        int y1 = points.get(0).getY();
        int x2 = points.get(1).getX();
        int y2 = points.get(1).getY();

        return Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
    }

    @Override
    public boolean isFigure() {
        return points.size() == 2;
    }
}
