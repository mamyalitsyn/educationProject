package codewars.lvl4;

import java.util.*;
import java.util.stream.LongStream;

/**
 * Getting along with Integer Partitions
 * @see <a href="https://www.codewars.com/kata/55cf3b567fc0e02b0b00000b/">Kata link</a>
 * <p>
 * In number theory and combinatorics, a partition of a positive integer n, also called an integer partition,
 * is a way of writing n as a sum of positive integers.
 * Two sums that differ only in the order of their summands are considered the same partition.
 */
public class IntPart {
    public static String part(long n) {
        Set<Long> prodSet = new HashSet<>();
        subPartition(n, n, 1, prodSet);
        long[] products = prodSet.stream().sorted().mapToLong(Long::longValue).toArray();
        LongSummaryStatistics stat = LongStream.of(products).summaryStatistics();
        int k = products.length;
        int k2 = k >> 1;
        double median = (k & 1) == 0 ? ((double)products[k2 - 1] + products[k2]) / 2.0
                : products[k2];
        return String.format("Range: %d Average: %.2f Median: %.2f", stat.getMax() - stat.getMin(),
                stat.getAverage(), median);
    }

    private static void subPartition(long n, long bound, long muliplier, Set<Long> products) {
        products.add(muliplier);
        if (bound >= n) {
            products.add(muliplier * n);
            bound = n - 1;
        }
        for (long i = 2; i <= bound; i++)
            subPartition(n - i, i, muliplier * i, products);
    }
}
