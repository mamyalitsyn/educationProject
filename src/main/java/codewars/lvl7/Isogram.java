package codewars.lvl7;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Isograms
 * <p>
 * An isogram is a word that has no repeating letters, consecutive or non-consecutive.
 * Implement a function that determines whether a string that contains only letters is an isogram.
 */
public class Isogram {
    public static boolean  isIsogram(String str) {
        //return str.length() == str.toLowerCase().chars().distinct().count()
        return str.equals("") || Arrays.stream(str.split(""))
                .map(String::toUpperCase)
                .collect(Collectors.toSet())
                .size() == str.length();
    }
}
