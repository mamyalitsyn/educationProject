package codewars.lvl7;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Two to One
 * <p>
 * Take 2 strings s1 and s2 including only letters from ato z.
 * Return a new sorted string, the longest possible, containing distinct letters - each taken only once - coming from s1 or s2.
 */
public class TwoToOne {
    public static String longest(String s1, String s2) {
        return Arrays.stream((s1 + s2).split(""))
                .distinct()
                .sorted()
                .collect(Collectors.joining());
    }
}
