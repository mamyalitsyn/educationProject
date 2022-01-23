package codewars.lvl8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateAverageTest {
    private static final double DELTA = 1e-15;

    @Test
    void testSomething() {
        assertEquals(1, CalculateAverage.find_average(new int[]{1, 1, 1}), DELTA);
        assertEquals(2, CalculateAverage.find_average(new int[]{1, 2, 3}), DELTA);
        assertEquals(2.5, CalculateAverage.find_average(new int[]{0, 1, 2, 7}), DELTA);
    }
}