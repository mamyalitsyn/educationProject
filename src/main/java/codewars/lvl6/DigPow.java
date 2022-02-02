package codewars.lvl6;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Playing with digits
 * @see <a href="https://www.codewars.com/kata/5552101f47fc5178b1000050/">Kata link</a>
 * <p>
 * We want to find a positive integer k, if it exists,
 * such as the sum of the digits of n taken to the successive powers of p is equal to k * n.
 */
public class DigPow {
    public static long digPow(int n, int p) {
        var digits = String.valueOf(n).chars().mapToObj(Character::getNumericValue).collect(Collectors.toList());
        int sum = 0;
        for (Integer i : digits) sum += Math.pow(i, p++);
        return sum%n == 0 ? sum/n : -1;
    }

    public static long digPow2(int n, int p) {
        int[] digits = String.valueOf(n).chars().map(Character::getNumericValue).toArray();
        int sum = IntStream.range(0, digits.length).map(i -> (int) Math.pow(digits[i], i + p)).sum();
        return sum % n == 0 ? sum / n : -1;
    }
}
