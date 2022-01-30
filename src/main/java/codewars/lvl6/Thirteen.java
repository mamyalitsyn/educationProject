package codewars.lvl6;

import static org.apache.commons.lang3.ArrayUtils.reverse;

/**
 * A Rule of Divisibility by 13
 * @see <a href="https://www.codewars.com/kata/554ca54ffa7d91b236000023/">Kata link</a>
 * <p>
 * Call thirt the function which processes this sequence of operations on an integer n (>=0).
 * Thirt will return the stationary number.
 */
public class Thirteen {
    public static long thirt(long n) {
        int[] thirteen = {1, 10, 9, 12, 3, 4};
        char[] digits = String.valueOf(n).toCharArray();
        reverse(digits);
        int sum = 0;
        while (true) {
            int temp = 0;
            for (int i = 0; i < digits.length; i++) temp += Character.getNumericValue(digits[i])*thirteen[i%6];
            if (temp == sum) break;
            sum = temp;
            digits = String.valueOf(sum).toCharArray();
            reverse(digits);
        }
        return sum;
    }

    public static long reflectiveThirt(long n) {
        int[] seq = {1,10,9,12,3,4};
        long v = 0, m = n;
        int p = 0;
        while (m>0) {
            v += (m%10)*seq[p++%6];
            m /= 10;
        }
        return v == n ? v : reflectiveThirt(v);
    }
}
