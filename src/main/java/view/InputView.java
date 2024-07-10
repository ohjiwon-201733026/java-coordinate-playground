package view;

import grid.domain.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public static Figure inputPoints() {
        Scanner sc = new Scanner(System.in);
        System.out.println("좌표를 입력하세요.");
        String input = sc.nextLine();

        List<Point> pointsList = new ArrayList<>();
        String [] pointsStr = input.split("-");

        Arrays.stream(pointsStr).forEach(point -> pointsList.add(makePoint(point)));

        if(pointsList.size() == 3) {
            return new Triangle(pointsList);
        }
        if(pointsList.size() == 4) {
            return new Rectangle(pointsList);
        }
        return new Points(pointsList);
    }

    private static Point makePoint(String pointStr) {
        String tmp = pointStr.replace("(", "");
        tmp = tmp.replace(")", "");

        String [] points = tmp.split(",");
        return new Point(Integer.parseInt(points[0]), Integer.parseInt(points[1]));
    }
}
