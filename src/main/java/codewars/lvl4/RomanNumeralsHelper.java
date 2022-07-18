package codewars.lvl4;

import java.util.Map;

import static java.lang.String.join;
import static java.util.Collections.nCopies;

/**
 * Roman Numerals Helper
 * @see <a href="https://www.codewars.com/kata/51b66044bce5799a7f000003/">Kata link</a>
 * <p>
 * Create a RomanNumerals class that can convert a roman numeral to and from an integer value.
 */
public class RomanNumeralsHelper {
    public static String toRoman(int n) {
        return join("", nCopies(n, "I"))
                .replace("IIIII", "V")
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");
    }

    public static int fromRoman(String romanNumeral) {
        if (romanNumeral.isEmpty()) return 0;
        Map<Character,Integer> map = Map.of('I',1,
                'V',5,
                'X',10,
                'L',50,
                'C',100,
                'D',500,
                'M',1000);
        var c = romanNumeral.charAt(0);
        if (romanNumeral.length() == 1) return map.get(c);
        return map.get(c) < map.get(romanNumeral.charAt(1)) ?
                        map.get(romanNumeral.charAt(1)) - map.get(c) + fromRoman(romanNumeral.substring(2)) :
                        map.get(c) + fromRoman(romanNumeral.substring(1));
    }
}
