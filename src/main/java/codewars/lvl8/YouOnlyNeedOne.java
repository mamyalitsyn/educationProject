package codewars.lvl8;

import java.util.Arrays;

/**
 * You only need one - Beginner
 * <p>
 * You will be given an array a and a value x.
 * All you need to do is check whether the provided array contains the value.
 */
public class YouOnlyNeedOne {
    public static boolean check(Object[] a, Object x) {
        return Arrays.stream(a).anyMatch(i -> i == x);
    }
}
