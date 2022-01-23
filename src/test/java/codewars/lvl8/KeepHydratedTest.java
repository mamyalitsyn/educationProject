package codewars.lvl8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KeepHydratedTest {

    KeepHydrated kh = new KeepHydrated();

    @Test
    void SampleTest1() {
        assertEquals(1, kh.Liters(2));
    }

    @Test
    void SampleTest2() {
        assertEquals(0, kh.Liters(0.97));
    }

    @Test
    void SampleTest3() {
        assertEquals(7, kh.Liters(14.64));
    }

    @Test
    void SampleTest4() {
        assertEquals(800, kh.Liters(1600.20));
    }

    @Test
    void SampleTest5() {
        assertEquals(40, kh.Liters(80));
    }
}