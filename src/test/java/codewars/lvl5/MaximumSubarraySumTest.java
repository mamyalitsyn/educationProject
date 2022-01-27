package codewars.lvl5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubarraySumTest {

    @Test
    void testEmptyArray() throws Exception {
        assertEquals(0, MaximumSubarraySum.betterSequence(new int[]{}), "Empty arrays should have a max of 0");
    }
    @Test
    void testExampleArray() throws Exception {
        assertEquals(6, MaximumSubarraySum.betterSequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), "Example array should have a max of 6");
    }
}