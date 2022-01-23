package leetcode.easy;

import java.util.HashMap;

/**
 * Two Sum
 *
 * @see <a href="https://leetcode.com/problems/two-sum/">Problem link</a>
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target...
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int requiredNum = target - nums[i];
            if (indexMap.containsKey(requiredNum)) {
                return new int[]{indexMap.get(requiredNum), i};
            }
            indexMap.put(nums[i], i);
        }
        return new int[0];
    }
}
