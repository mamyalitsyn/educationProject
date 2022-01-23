package codewars.lvl8;

/**
 * Are You Playing Banjo?
 * <p>
 * Create a function which answers the question "Are you playing banjo?".
 * If your name starts with the letter "R" or lower case "r", you are playing banjo!
 */
public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        return name.startsWith("R") || name.startsWith("r") ? name + " plays banjo" : name + " does not play banjo";
    }
}
