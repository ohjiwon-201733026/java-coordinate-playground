package grid.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RectangleTest {

    @Test
    @DisplayName("직사각형 여부 확인")
    public void isRectangleTest() {
        Rectangle rectangle = new Rectangle(Arrays.asList(new Point(4, 3)
                , new Point(4,1), new Point(2,3), new Point(2,1)));
        assertEquals(rectangle.isFigure(), true);
    }

    @Test
    @DisplayName("직사각형 아닌 경우 확인 (점 4개 미만)")
    public void isRectangleTest_less_than_4_points() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(Arrays.asList(new Point(4, 3)
                , new Point(4,1), new Point(2,3))));
    }

    @Test
    @DisplayName("직사각형 아닌 경우 확인")
    public void isRectangleTest_notRectangle() {
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(Arrays.asList(new Point(4, 3)
                , new Point(1,1), new Point(2,3))));
    }
}
