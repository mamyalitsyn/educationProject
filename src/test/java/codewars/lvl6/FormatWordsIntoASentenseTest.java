package codewars.lvl6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FormatWordsIntoASentenseTest {

    @Test
    void sampleTests() {
        assertEquals("one and three", FormatWordsIntoASentense.formatWords(new String[] {"one", "", "three"}));
        assertEquals("one, two, three and four", FormatWordsIntoASentense.formatWords(new String[] {"one", "two", "three", "four"}));
        assertEquals("one", FormatWordsIntoASentense.formatWords(new String[] {"one"}));
        assertEquals("one and three", FormatWordsIntoASentense.formatWords(new String[] {"one", "", "three"}));
        assertEquals("three", FormatWordsIntoASentense.formatWords(new String[] {"", "", "three"}));
        assertEquals("one and two", FormatWordsIntoASentense.formatWords(new String[] {"one", "two", ""}));
        assertEquals("", FormatWordsIntoASentense.formatWords(new String[] {}));
        assertEquals("", FormatWordsIntoASentense.formatWords(null));
        assertEquals("", FormatWordsIntoASentense.formatWords(new String[] {""}));
    }
}