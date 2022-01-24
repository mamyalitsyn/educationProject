package codewars.lvl8;

import java.util.Arrays;

/**
 * How good are you really?
 *
 * @see <a href="https://www.codewars.com/kata/5601409514fc93442500010b/">Kata link</a>
 * <p>
 * There was a test in your class, and you passed it. Congratulations!
 * But you're an ambitious person.
 * You want to know if you're better than the average student in your class.
 */
public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return yourPoints > Arrays.stream(classPoints).average().getAsDouble();
    }
}
