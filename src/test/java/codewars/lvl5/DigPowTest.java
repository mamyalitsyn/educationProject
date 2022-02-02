package codewars.lvl5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigPowTest {

    @Test
    void Test1() {
        assertEquals(1, DigPow.digPow(89, 1));
    }
    @Test
    void Test2() {
        assertEquals(-1, DigPow.digPow(92, 1));
    }
    @Test
    void Test3() {
        assertEquals(51, DigPow.digPow(46288, 3));
    }
}