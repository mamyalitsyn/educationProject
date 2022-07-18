package codewars.lvl6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeDecoderTest {

    @Test
    void testExampleFromDescription() {
        assertEquals("HEY JUDE", MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."));
        assertEquals("SOS", MorseCodeDecoder.decode("... --- ..."));
    }
}