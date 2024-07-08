package grid.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointsTest {

    @Test
    @DisplayName("points print")
    public void pointsPrint() {
        Points points = new Points(Arrays.asList(new Point(24, 3)));
        String pointStr = points.getRowString(24);

        assertEquals("24|  *                     ", pointStr);
    }

    @Test
    @DisplayName("points print")
    public void pointsPrint_odd() {
        Points points = new Points(Arrays.asList(new Point(9, 3)));
        String pointStr = points.getRowString(9);

        assertEquals("  |  *                     ", pointStr);
    }

    @Test
    @DisplayName("draw Grid")
    public void drawGrid() {
        Points points = new Points(Arrays.asList(new Point(10, 9)));
        String pointStr = points.drawGrid();

        String expected =   "24|                        \n" +
                            "  |                        \n" +
                            "22|                        \n" +
                            "  |                        \n" +
                            "20|                        \n" +
                            "  |                        \n" +
                            "18|                        \n" +
                            "  |                        \n" +
                            "16|                        \n" +
                            "  |                        \n" +
                            "14|                        \n" +
                            "  |                        \n" +
                            "12|                        \n" +
                            "  |                        \n" +
                            "10|        *               \n" +
                            "  |                        \n" +
                            " 8|                        \n" +
                            "  |                        \n" +
                            " 6|                        \n" +
                            "  |                        \n" +
                            " 4|                        \n" +
                            "  |                        \n" +
                            " 2|                        \n" +
                            "  |                        \n" +
                            "  +------------------------";


        assertEquals(expected, pointStr);
    }

    @Test
    @DisplayName("두 점 사이 거리 구하기")
    public void getDistance() {
        Points points = new Points(Arrays.asList(new Point(10, 10), new Point(5,5)));
        assertEquals(7.0710678118654755, points.getDistance());
    }

    @Test
    @DisplayName("직선여부")
    public void isStraightLine() {
        Points points = new Points(Arrays.asList(new Point(10, 10)));
        assertEquals(false, points.isStraightLine());
    }
}
