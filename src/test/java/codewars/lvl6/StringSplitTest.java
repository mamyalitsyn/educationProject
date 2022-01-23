package codewars.lvl6;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringSplitTest {

    @Test
    void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertEquals("[ab, cd, ef]", Arrays.toString(StringSplit.solution(s)), "Should handle even string");
        assertEquals("[He, ll, oW, or, ld]", Arrays.toString(StringSplit.solution(s1)), "Should handle even string");
    }

    @Test
    void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals("[ab, cd, e_]", Arrays.toString(StringSplit.solution(s)), "Should handle odd string");
        assertEquals("[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplit.solution(s1)), "Should handle odd string");
    }
}