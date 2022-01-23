package leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Longest Substring Without Repeating Characters
 *
 * @see <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">Problem link</a>
 * Given a string s, find the length of the longest substring without repeating characters.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
