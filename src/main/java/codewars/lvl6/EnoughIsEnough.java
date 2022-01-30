package codewars.lvl6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Enough is enough
 * @see <a href="https://www.codewars.com/kata/554ca54ffa7d91b236000023/">Kata link</a>
 * <p>
 * Delete occurrences of an element if it occurs more than n times.
 * Alice and Bob were on a holiday.
 * Both of them took many pictures of the places they've been,
 * and now they want to show Charlie their entire collection.
 */
public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        var map = Arrays.stream(elements).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        for (var e : map.entrySet()) {
            if (e.getValue() > maxOccurrences) map.put(e.getKey(), (long) maxOccurrences);
        }
        var toReturn = new ArrayList<Integer>();
        for (int i : elements) {
            var temp = map.get(i);
            if (temp > 0) {
                toReturn.add(i);
                map.put(i, --temp);
            }

        }
        return toReturn.stream().mapToInt(i -> i).toArray();
    }

    public static int[] deleteNth2(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> occurrence = new HashMap<>();
        return IntStream.of(elements)
                .filter(motif -> occurrence.merge(motif, 1, Integer::sum) <= maxOccurrences)
                .toArray();
    }
}
