package codewars.lvl5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BestTravelTest {

    @Test
    void BasicTests1() {
        System.out.println("****** Basic Tests small numbers******");
        List<Integer> ts = new ArrayList<>(Arrays.asList(50, 55, 56, 57, 58));
        int n = BestTravel.chooseBestSum(163, 3, ts);
        assertEquals(163, n);
        ts = new ArrayList<>(List.of(50));
        Integer m = BestTravel.chooseBestSum(163, 3, ts);
        assertNull(m);
        ts = new ArrayList<>(Arrays.asList(91, 74, 73, 85, 73, 81, 87));
        n = BestTravel.chooseBestSum(230, 3, ts);
        assertEquals(228, n);
        n = BestTravel.chooseBestSum(331, 2, ts);
        assertEquals(178, n);
        n = BestTravel.chooseBestSum(331, 4, ts);
        assertEquals(331, n);
        m = BestTravel.chooseBestSum(331, 5, ts);
        assertNull(m);
        n = BestTravel.chooseBestSum(331, 1, ts);
        assertEquals(91, n);
        m = BestTravel.chooseBestSum(700, 8, ts);
        assertNull(m);
    }
    @Test
    void BasicTests2() {
        System.out.println("****** Basic Tests bigger numbers******");
        List<Integer> ts = new ArrayList<>(Arrays.asList(100, 76, 56, 44, 89, 73, 68, 56, 64, 123, 2333, 144, 50, 132, 123, 34, 89));
        int n = BestTravel.chooseBestSum(230, 4, ts);
        assertEquals(230, n);
        n = BestTravel.chooseBestSum(430, 5, ts);
        assertEquals(430, n);
        Integer m = BestTravel.chooseBestSum(430, 8, ts);
        assertNull(m);
        n = BestTravel.chooseBestSum(880, 8, ts);
        assertEquals(876, n);
        n = BestTravel.chooseBestSum(2430, 15, ts);
        assertEquals(1287, n);
        n = BestTravel.chooseBestSum(100, 2, ts);
        assertEquals(100, n);
        n = BestTravel.chooseBestSum(276, 3, ts);
        assertEquals(276, n);
        n = BestTravel.chooseBestSum(3760, 17, ts);
        assertEquals(3654, n);
        m = BestTravel.chooseBestSum(3760, 40, ts);
        assertNull(m);
        n = BestTravel.chooseBestSum(50, 1, ts);
        assertEquals(50, n);
        m = BestTravel.chooseBestSum(1000, 18, ts);
        assertNull(m);
        ts = new ArrayList<>(Arrays.asList(100, 64, 123, 2333, 144, 50, 132, 123, 34, 89));
        m = BestTravel.chooseBestSum(230, 4, ts);
        assertNull(m);
        n = BestTravel.chooseBestSum(230, 2, ts);
        assertEquals(223, n);
        n = BestTravel.chooseBestSum(2333, 1, ts);
        assertEquals(2333, n);
        n = BestTravel.chooseBestSum(2333, 8, ts);
        assertEquals(825, n);
        ts = new ArrayList<>(Arrays.asList(1000, 640, 1230, 2333, 1440, 500, 1320, 1230, 340, 890, 732, 1346));
        n = BestTravel.chooseBestSum(2300, 4, ts);
        assertEquals(2212, n);
        m = BestTravel.chooseBestSum(2300, 5, ts);
        assertNull(m);
        n = BestTravel.chooseBestSum(2332, 3, ts);
        assertEquals(2326, n);
        n = BestTravel.chooseBestSum(23331, 8, ts);
        assertEquals(10789, n);
        m = BestTravel.chooseBestSum(331, 2, ts);
        assertNull(m);
    }

}