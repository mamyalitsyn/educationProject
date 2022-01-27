package codewars.lvl8;

/**
 * Sentence Smash
 * <p>
 * Write a function that takes an array of words and smashes them together into a sentence and returns the sentence.
 */
public class SmashWords {
    public static String smash(String... words) {
        return String.join(" ", words);
    }
}
