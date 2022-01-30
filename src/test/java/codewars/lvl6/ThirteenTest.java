package codewars.lvl6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirteenTest {

    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }

    @Test
    void test1() {
        System.out.println("Fixed Tests: thirt");
        testing(Thirteen.thirt(8529), 79);
        testing(Thirteen.reflectiveThirt(85299258), 31);
        testing(Thirteen.thirt(5634), 57);
        testing(Thirteen.thirt(1111111111), 71);
        testing(Thirteen.thirt(987654321), 30);
    }
}