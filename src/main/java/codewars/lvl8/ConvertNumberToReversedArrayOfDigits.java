package codewars.lvl8;

/**
 * Convert number to reversed array of digits
 * <p>
 * Given a random non-negative number, you have to return the digits of this number within an array in reverse order.
 */
public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        int[] response = new int[String.valueOf(n).length()];
        for (int i = 0; i < response.length; i++) {
            response[i] = (int) (n%10);
            n/=10;
        }
        return response;
    }

    public static int[] alternativeDigitize(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();
    }
}
