package codewars.lvl8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertNumberToReversedArrayOfDigitsTest {

    @Test
    void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, ConvertNumberToReversedArrayOfDigits.digitize(35231));
        assertArrayEquals(new int[] {0}, ConvertNumberToReversedArrayOfDigits.digitize(0));
    }
}