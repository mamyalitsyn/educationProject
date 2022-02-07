package codewars.lvl6;

import java.util.Arrays;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Find the unique number
 * @see <a href="https://www.codewars.com/kata/585d7d5adb20cf33cb000235/">Kata link</a>
 * <p>
 * There is an array with some numbers. All numbers are equal except for one. Try to find it!
 */
public class FindTheUniqueNumber {
    public static double findUniq(double arr[]) {
        return Arrays.stream(arr).boxed()
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse(0.0);
    }
}
