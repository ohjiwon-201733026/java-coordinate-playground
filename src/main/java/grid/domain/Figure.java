package grid.domain;

import java.util.List;

public abstract class Figure {
    private static final String BAR = "|";
    private static final String DOUBLE_SPACE = "  ";

    List<Point> points;

    public String drawGrid() {
        StringBuilder result = new StringBuilder();

        for(int row = 24; row >= 1; row--) {
            result.append(getRowString(row));
            result.append("\n");
        }

        result.append("  +------------------------");
        return result.toString();
    }

    public String getRowString(int row) {
        StringBuilder rowString = new StringBuilder();
        rowString.append(getRowNumberString(row));
        rowString.append(BAR);

        for(int col = 1; col <= 24; col++) {
            rowString.append(getPointsString(row,col));
        }

        return rowString.toString();
    }

    private String getRowNumberString(int row) {
        if(row % 2 == 0) {
            return String.format("%2s", row);
        }
        return DOUBLE_SPACE;
    }

    private String getPointsString(int row, int col) {
        StringBuilder rowString = new StringBuilder();
        for (Point point : points) {
            rowString.append(point.getCharacter(row, col));
        }

        return rowString.toString();
    }

    public abstract double getArea();
    public abstract boolean isFigure();


}
