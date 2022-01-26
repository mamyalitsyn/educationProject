package codewars.lvl6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateEncoderTest {
    @Test
    void test() {
        assertEquals(")()())()(()()(",
                DuplicateEncoder.streamEncode("Prespecialized"));
        assertEquals("))))())))",DuplicateEncoder.streamEncode("   ()(   "));
    }
}