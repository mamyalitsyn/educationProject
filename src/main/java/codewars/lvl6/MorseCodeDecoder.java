package codewars.lvl6;

/**
 * Decode the Morse code
 * @see <a href="https://www.codewars.com/kata/54b724efac3d5402db00065e/">Kata link</a>
 * <p>
 * In this kata you have to write a simple Morse code decoder.
 * While the Morse code is now mostly superseded by voice and digital data communication channels,
 * it still has its use in some applications around the world.
 */
public class MorseCodeDecoder {
    public static String decode(String morseCode) {
        StringBuilder result = new StringBuilder();
        for(String word : morseCode.trim().split("   ")) {
            for(String letter : word.split(" ")) {
                //result.append(MorseCode.get(letter));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }
}
