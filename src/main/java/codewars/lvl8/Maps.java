package codewars.lvl8;

import java.util.Arrays;

/**
 * Beginner - Lost Without a Map
 * <p>
 * Given an array of integers, return a new array with each value doubled.
 */
public class Maps {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(i -> i * 2).toArray();
    }
}
