package leetcode.easy;

/**
 * Palindrome Number
 *
 * @see <a href="https://leetcode.com/problems/palindrome-number/">Problem link</a>
 * <p>
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int backwards = 0;
        int copy = x;
        while(x != 0) {
            backwards = backwards * 10 + copy % 10;
            copy /= 10;
        }
        return x == backwards;
    }
}
