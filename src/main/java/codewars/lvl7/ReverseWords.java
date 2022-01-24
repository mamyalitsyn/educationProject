package codewars.lvl7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Reverse words
 * <p>
 * Complete the function that accepts a string parameter, and reverses each word in the string.
 * All spaces in the string should be retained.
 */
public class ReverseWords {
    public static String reverseWords2(final String original) {
        return original.isEmpty() ? original : Stream.of(original.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));
    }

    public static String reverseWords(final String original) {
        var splited = original.split(" ");
        for (int i = 0; i < splited.length; i ++) {
            var sb = new StringBuilder(splited[i]);
            splited[i] = sb.reverse().toString();
        }
        return original.isBlank() ? original : String.join(" ", splited);
    }
}
