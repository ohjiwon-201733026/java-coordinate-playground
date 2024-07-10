import grid.domain.Figure;
import grid.domain.Points;
import view.InputView;

public class PointCalculatorMain {

    public static void main(String[] args) {
        Figure points = null;
        while(true) {
            try {
                points = InputView.inputPoints();
            } catch (IllegalArgumentException iae) {
                continue;
            }
            break;
        }

        System.out.println(points.drawGrid());
        if(points.isFigure()) {
            System.out.println("두 점 사이 거리는 " + points.getArea());
        }
    }

}
