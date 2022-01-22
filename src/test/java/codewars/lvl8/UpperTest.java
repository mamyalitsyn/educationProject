package codewars.lvl8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UpperTest {

    @Test
    void makeUpperCase() {
        assertEquals("HELLO", Upper.MakeUpperCase("hello"));
    }
}