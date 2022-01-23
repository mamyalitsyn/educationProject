package codewars.lvl7;

import org.apache.commons.lang3.Range;

import java.util.stream.IntStream;

/**
 * Factorial
 *
 * @see <a href="https://www.codewars.com/kata/54ff0d1f355cfd20e60001fc">Kata link</a>
 * <p>
 * In mathematics, the factorial of a non-negative integer n,
 * denoted by n!, is the product of all positive integers less than or equal to n...
 */
public class Factorial {
    public int factorial(int n) {
        Range<Integer> range = Range.between(0, 12);
        if (!range.contains(n)) {
            throw new IllegalArgumentException("n range should be in 0-12");
        }
        if (n == 0) return 1;
        return IntStream.rangeClosed(1, n).reduce((x, y) -> x * y).getAsInt();

        //return IntStream.rangeClosed(1, n).reduce(1, (a, b) -> a * b);

        /*if(n < 0 || n > 12) throw new IllegalArgumentException("Useless fuffery!");
        return n <= 1 ? 1 : n * factorial(n - 1);*/
    }
}
