package codewars.lvl5;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

/**
 * Find the unique string
 * @see <a href="https://www.codewars.com/kata/585d8c8a28bc7403ea0000c3/">Kata link</a>
 * <p>
 * There is an array of strings. All strings contains similar letters except one. Try to find it!
 */
public class FindTheUniqueString {
    public static String solution(String... arr) {
        String[] distincted = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            distincted[i] = StringUtils.deleteWhitespace(
                    arr[i].toLowerCase().chars().sorted().distinct().mapToObj(s -> String.valueOf((char)s)).collect(joining()));
        }
        var unique = Arrays.stream(distincted)
                .collect(groupingBy(identity(), counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse("");
        if (unique.equals("")) return Arrays.stream(arr).filter(StringUtils::isBlank).findFirst().get();
        for (String s : arr) {
            boolean isUnique = true;
            for (char c : unique.toCharArray()) {
                if (!s.toLowerCase().contains(String.valueOf(c))) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) return s;
        }
        return "";
    }
}
