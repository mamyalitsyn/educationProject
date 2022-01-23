package codewars.lvl8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OppositeNumberTest {

    @Test
    void tests() {
        assertEquals(-1, OppositeNumber.opposite(1));
    }
}