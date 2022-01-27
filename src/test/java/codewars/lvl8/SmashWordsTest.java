package codewars.lvl8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmashWordsTest {

    @Test
    void validate() {
        assertEquals("Bilal Djaghout", SmashWords.smash("Bilal", "Djaghout"));
    }

    @Test
    void validateEmpty() {
        assertEquals("", SmashWords.smash());
    }


    @Test
    void validateOneWord() {
        assertEquals("Bilal", SmashWords.smash("Bilal"));
    }
}