package codewars.lvl5;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class FindTheUniqueStringTest {

    @Test
    void sampleTestCases() {
        assertEquals("BbBb",
                FindTheUniqueString.solution("Aa", "aaa", "aaaaa", "BbBb", "Aaaa", "AaAaAa", "a"));
        assertEquals("foo",
                FindTheUniqueString.solution("abc", "acb", "bac", "foo", "bca", "cab", "cba"));
        assertEquals("victor",
                FindTheUniqueString.solution("silvia", "vasili", "victor"));
        assertEquals("Harry Potter",
                FindTheUniqueString.solution("Tom Marvolo Riddle", "I am Lord Voldemort", "Harry Potter"));

    }

    @Test
    void randomTestCase() {
        String defaultString = RandomStringUtils.randomAlphabetic(5);
        String uniqueString = RandomStringUtils.randomAlphabetic(5);
        assertEquals(uniqueString,
                FindTheUniqueString.solution(shuffle(defaultString), shuffle(defaultString), uniqueString, shuffle(defaultString)));
    }

    @Test
    void spacesTestCases() {
        assertEquals("a",
                FindTheUniqueString.solution("", "", "", "a", "", ""));
        assertEquals("a",
                FindTheUniqueString.solution("    ", "  ", " ", "a", " ", ""));
        assertEquals("   ",
                FindTheUniqueString.solution("foobar", "barfo", "fobara", "   ", "fobra", "oooofrab"));
    }

    private String shuffle(String s) {
        var chars = Arrays.asList(s.split(""));
        Collections.shuffle(chars);
        return String.join("", chars);
    }
}