package codewars.lvl5;

/**
 * Maximum subarray sum
 * <p>
 * The maximum sum subarray problem consists in finding the maximum sum
 * of a contiguous subsequence in an array or list of integers:
 */
public class MaximumSubarraySum {
    public static int sequence(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int tempSum = 0;
            for (int j = i; j < arr.length; j++) {
                tempSum += arr[j];
                if (tempSum > sum) {
                    sum = tempSum;
                }
            }
        }
        return sum;
    }

    public static int betterSequence(int[] arr) {
        int iterator = 0, max = 0;
        for (int v : arr) {
            iterator = Math.max(0, iterator + v);
            max = Math.max(max, iterator);
        }
        return max;
    }
}
