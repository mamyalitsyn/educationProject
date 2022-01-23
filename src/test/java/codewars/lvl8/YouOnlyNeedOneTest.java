package codewars.lvl8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class YouOnlyNeedOneTest {

    @Test
    void testSomething() {
        assertEquals(YouOnlyNeedOne.check(new Object[]{66, 101}, 66), true);
        assertEquals(YouOnlyNeedOne.check(new Object[]{80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
        assertEquals(YouOnlyNeedOne.check(new Object[]{'t', 'e', 's', 't'}, 'e'), true);
        assertEquals(YouOnlyNeedOne.check(new Object[]{"what", "a", "great", "kata"}, "kat"), false);
    }
}