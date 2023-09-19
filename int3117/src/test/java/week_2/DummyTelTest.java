package week_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static nam.week_2.DummyTel.totalCost;

public class DummyTelTest {
    @Test
    void testDummyTel2() {
        assertEquals(-1, totalCost(25, 0, 0, 15));
    }

    @Test
    void testDummyTel1() {
        assertEquals(2.63, totalCost(18, 15, 0, 10));
    }

    @Test
    void testDummyTel3() {
        assertEquals(15.62, totalCost(18, 15, 0, 70));
    }

    @Test
    void testDummyTel4() {
        assertEquals(5.25, totalCost(9, 15, 0, 10));
    }

    @Test
    void testDummyTel5() {
        assertEquals(31.24, totalCost(9, 15, 0, 70));
    }
}
