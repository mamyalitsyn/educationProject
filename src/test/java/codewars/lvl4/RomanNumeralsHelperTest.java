package codewars.lvl4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanNumeralsHelperTest {

    @Test
    void testToRoman() {
        assertEquals("IX", RomanNumeralsHelper.toRoman(9));
        assertEquals("I", RomanNumeralsHelper.toRoman(1));
        assertEquals("II", RomanNumeralsHelper.toRoman(2));
    }

    @Test
    void testFromRoman() {
        assertEquals(1, RomanNumeralsHelper.fromRoman("I"));
        assertEquals(2, RomanNumeralsHelper.fromRoman("II"));
        assertEquals(4, RomanNumeralsHelper.fromRoman("IV"));
    }
}