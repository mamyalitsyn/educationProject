package leetcode.hard;

import java.util.Arrays;

/**
 * Median of Two Sorted Arrays
 *
 * @see <a href="https://leetcode.com/problems/median-of-two-sorted-arrays/">Problem link</a>
 * <p>
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        final int[] joinedArray = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, joinedArray, 0, nums1.length);
        System.arraycopy(nums2, 0, joinedArray, nums1.length, nums2.length);
        var sum = Arrays.stream(joinedArray).sorted().toArray();
        var length = sum.length;
        if (length % 2 == 0) {
            double test = sum[length / 2] + sum[length / 2 - 1];
            return test / 2;
        } else return sum[length / 2];
    }
}
