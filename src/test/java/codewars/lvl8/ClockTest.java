package codewars.lvl8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClockTest {

    @Test
    void test1() {
        assertEquals(61000, Clock.Past(0, 1, 1));
    }
}