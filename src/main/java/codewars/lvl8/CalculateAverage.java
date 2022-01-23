package codewars.lvl8;

import java.util.Arrays;

/**
 * Calculate average
 * <p>
 * Write a function which calculates the average of the numbers in a given list.
 */
public class CalculateAverage {
    public static double find_average(int[] array) {
        //return (double) Arrays.stream(array).sum()/array.length;
        return Arrays.stream(array).average().orElse(0);
    }
}
