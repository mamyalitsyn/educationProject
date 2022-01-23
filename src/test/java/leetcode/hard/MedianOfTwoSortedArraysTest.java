package leetcode.hard;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MedianOfTwoSortedArraysTest {

    MedianOfTwoSortedArrays median;

    @BeforeEach
    void setUp() {
        median = new MedianOfTwoSortedArrays();
    }

    @Test
    void oddJoinedArrayTest() {
        var result = median.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});

        assertEquals(2, result);
    }

    @Test
    void evenJoinedArrayTest() {
        var result = median.findMedianSortedArrays(new int[]{1, 3}, new int[]{2, 4});

        assertEquals(2.5, result);
    }
}