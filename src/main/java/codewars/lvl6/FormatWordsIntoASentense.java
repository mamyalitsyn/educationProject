package codewars.lvl6;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;

/**
 * Format words into a sentence
 * @see <a href="https://www.codewars.com/kata/51689e27fe9a00b126000004/">Kata link</a>
 * <p>
 * Complete the method so that it formats the words into a single comma separated value.
 * The last word should be separated by the word 'and' instead of a comma.
 */
public class FormatWordsIntoASentense {
    public static String formatWords(String[] words) {
        words = ArrayUtils.isEmpty(words) ? words : Arrays.stream(words)
                .filter(x -> !StringUtils.isBlank(x)).toArray(String[]::new);
        if (ArrayUtils.isEmpty(words)) return "";
        return words.length == 1 ? words[0] : StringUtils.join(words, ", ")
                .substring(0, StringUtils.join(words, ", ").lastIndexOf(','))
                .concat(" and " + words[words.length-1]);
    }
}
