package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    TwoSum sum = new TwoSum();

    @Test
    void twoSum() {
        assertArrayEquals(new int[]{0, 1}, sum.twoSum2(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{1, 2}, sum.twoSum2(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{0, 1}, sum.twoSum2(new int[]{3, 3}, 6));
    }
}