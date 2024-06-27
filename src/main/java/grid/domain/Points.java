package grid.domain;

import java.util.List;

public class Points {
    private static final String BAR = "|";
    private static final String DOUBLE_SPACE = "  ";
    private static final String SPACE = " ";

    private List<Point> points;

    public Points(List<Point> points) {
        this.points = points;
    }

    public String getRowString(int row) {
        StringBuilder rowString = new StringBuilder();

        if(row % 2 ==0) {
            if(row < 10) rowString.append(SPACE).append(row);
            else rowString.append(row);
        }
        else rowString.append(DOUBLE_SPACE);

        rowString.append(BAR);

        for(int col = 1; col <= 24; col++) {
            rowString.append(getPointsString(row,col));
        }

        return rowString.toString();
    }

    private String getPointsString(int row, int col) {
        StringBuilder rowString = new StringBuilder();
        for (Point point : points) {
            rowString.append(point.getCharacter(row, col));
        }

        return rowString.toString();
    }

    public String drawGrid() {
        StringBuilder result = new StringBuilder();

        for(int row = 24; row >=1; row--) {
            result.append(getRowString(row));
            result.append("\n");
        }

        result.append("  +------------------------");

        return result.toString();
    }

}