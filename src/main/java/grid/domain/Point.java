package grid.domain;

public class Point {

    private static final String SPACE = " ";
    private static final String STAR = "*";

    private int x;
    private int y;

    public Point(int x, int y) {
        if(x < 1 || x > 24 || y < 1 || y > 24) {
            throw new IllegalArgumentException("x or y must be between 1 and 24");
        }
        this.x = x;
        this.y = y;
    }

    public String getCharacter(int row, int col) {
        if(isMatch(row, col)) return STAR;
        return SPACE;
    }

    boolean isMatch(int row, int col) {
        return x == row && y == col;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
