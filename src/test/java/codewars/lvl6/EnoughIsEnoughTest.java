package codewars.lvl6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnoughIsEnoughTest {

    @Test
    void deleteNth() {
        assertArrayEquals(
                new int[] { 20, 37, 21 },
                EnoughIsEnough.deleteNth2( new int[] { 20, 37, 20, 21 }, 1 )
        );
        assertArrayEquals(
                new int[] { 1, 1, 3, 3, 7, 2, 2, 2 },
                EnoughIsEnough.deleteNth2( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )

        );
        assertArrayEquals(
                new int[] { 1, 2, 3, 1, 1, 2, 2, 3, 3, 4, 5 },
                EnoughIsEnough.deleteNth2( new int[] { 1, 2, 3, 1, 1, 2, 1, 2, 3, 3, 2, 4, 5, 3, 1 }, 3 )
        );
        assertArrayEquals(
                new int[] { 1, 1, 1, 1, 1 },
                EnoughIsEnough.deleteNth2( new int[] { 1, 1, 1, 1, 1 }, 5 )
        );
        assertArrayEquals(
                new int[] { },
                EnoughIsEnough.deleteNth2( new int[] { }, 5 )
        );

    }
}