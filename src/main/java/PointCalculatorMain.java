import grid.domain.Points;
import view.InputView;

public class PointCalculatorMain {

    public static void main(String[] args) {
        boolean flag = true;
        Points points = null;

        while(flag) {
            try {
                points = InputView.inputPoints();
            } catch (IllegalArgumentException iae) {
                flag = true;
                continue;
            }
            break;
        }

        System.out.println(points.drawGrid());
        if(points.isStraightLine()) {
            System.out.println("두 점 사이 거리는 " + points.getDistance());
        }
    }

}
