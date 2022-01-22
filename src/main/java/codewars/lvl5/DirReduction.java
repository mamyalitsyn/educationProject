package codewars.lvl5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Directions Reduction
 * @see <a href="https://www.codewars.com/kata/550f22f4d758534c1100025a">Kata link</a>
 * Once upon a time, on a way through the old wild mountainous west,…
 */
public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        Map<String, String> pairs = new HashMap<>();
        pairs.put("NORTH", "SOUTH");
        pairs.put("SOUTH", "NORTH");
        pairs.put("EAST", "WEST");
        pairs.put("WEST", "EAST");
        var list = new ArrayList<>(Arrays.asList(arr));
        if (list.contains(pairs.get(list.get(0)))) {
            list.remove(pairs.get(list.get(0)));
            list.remove(0);
        }
        return list.toArray(new String[0]);
    }
}
