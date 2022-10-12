package leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeNumberTest {

    PalindromeNumber pn = new PalindromeNumber();

    @Test
    void isPalindrome() {
        assertTrue(pn.isPalindrome(121));
        assertFalse(pn.isPalindrome(-121));
        assertFalse(pn.isPalindrome(10));
    }

}