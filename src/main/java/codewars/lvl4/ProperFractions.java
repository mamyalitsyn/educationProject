package codewars.lvl4;

public class ProperFractions {
    public static long properFractions(long n) {
        if (n < 2) return 0;
        double result = n;
        for (long i = 2; i * i <= n; ++i) {
            if (n % i == 0) {
                while (n % i == 0) {
                    n /= i;
                }
                result *= (1.0 - (1.0 / i));
            }
        }
        if (n > 1) {
            result *= (1.0 - (1.0 / n));
        }
        return (long) result;
    }
}
