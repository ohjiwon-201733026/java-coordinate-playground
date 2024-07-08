package grid.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class PointTest {

    @Test
    @DisplayName("24 이상 point 값")
    public void point_create_over_24() {
        assertThrows(IllegalArgumentException.class, () -> new Point(25,25));
    }

    @Test
    @DisplayName("0 이하 point 값")
    public void point_create_less_than_1() {
        assertThrows(IllegalArgumentException.class, () -> new Point(0,25));
    }
}
