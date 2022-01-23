package codewars.lvl6;

/**
 * Split Strings
 * <p>
 * Complete the solution so that it splits the string into pairs of two characters.
 * If the string contains an odd number of characters
 * then it should replace the missing second character of the final pair with an underscore ('_').
 */
public class StringSplit {
    public static String[] solution(String s) {
        if (s.length() % 2 == 1) {
            s += "_";
        }
        return s.split("(?<=\\G.{2})");
    }
}
