package view;

import grid.domain.Point;
import grid.domain.Points;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public static Points inputPoints() {
        Scanner sc = new Scanner(System.in);
        System.out.println("좌표를 입력하세요.");
        String input = sc.nextLine();

        List<Point> pointsList = new ArrayList<>();
        String [] pointsStr = input.split("~");
        for (String pointStr : pointsStr) {
            String tmp = pointStr.replace("(", "");
            tmp = tmp.replace(")", "");

            String [] points = tmp.split(",");
            pointsList.add(new Point(Integer.parseInt(points[0]), Integer.parseInt(points[1])));
        }

        return new Points(pointsList);
    }
}
