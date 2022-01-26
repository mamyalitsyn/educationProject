package codewars.lvl6;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Duplicate Encoder
 * <p>
 * The goal of this exercise is to convert a string to a new string where each character in the new string is "("
 * if that character appears only once in the original string,
 * or ")" if that character appears more than once in the original string.
 * Ignore capitalization when determining if a character is a duplicate.
 */
public class DuplicateEncoder {
    static String encode(String word) {
        Map<Character, Integer> map = new HashMap<>();
        var toReplace = word.toUpperCase().toCharArray();
        for(char c : toReplace)
        {
            if(map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
        for (int i = 0; i < toReplace.length; i++) {
            toReplace[i] = map.get(toReplace[i]) > 1 ? ')' : '(';
        }
        return String.valueOf(toReplace);
    }

    static String streamEncode(String word) {
        return word.toLowerCase()
                .chars()
                .mapToObj(i -> String.valueOf((char)i))
                .map(i -> word.toLowerCase().indexOf(i) == word.toLowerCase().lastIndexOf(i) ? "(" : ")")
                .collect(Collectors.joining());
    }
}
