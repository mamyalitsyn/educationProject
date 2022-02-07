package codewars.lvl4;

import java.util.*;

/**
 * Permutations
 * @see <a href="https://www.codewars.com/kata/5254ca2719453dcc0b00027d/">Kata link</a>
 * <p>
 * In this kata you have to create all permutations of an input string and remove duplicates, if present.
 * This means, you have to shuffle all letters from the input in all possible orders.
 */
public class Permutations {
    public static List<String> singlePermutations(String s) {
        if (s.length() == 1) return List.of(s);
        Set<String> set = new HashSet<>();
        var elements = s.toCharArray();
        int[] indexes = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            indexes[i] = 0;
        }
        int i = 0;
        swap(elements, 0, 1);
        set.add(String.valueOf(elements));
        while (i < s.length()) {
            if (indexes[i] < i) {
                swap(elements, i % 2 == 0 ?  0: indexes[i], i);
                set.add(String.valueOf(elements));
                indexes[i]++;
                i = 0;
            }
            else {
                indexes[i] = 0;
                i++;
            }
        }
        return new ArrayList<>(set);
    }

    private static void swap(char[] input, int a, int b) {
        char tmp = input[a];
        input[a] = input[b];
        input[b] = tmp;
    }
}
