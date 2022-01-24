package codewars.lvl5;

import java.util.Arrays;
import java.util.Objects;

/**
 * Directions Reduction
 * @see <a href="https://www.codewars.com/kata/550f22f4d758534c1100025a">Kata link</a>
 * <p>
 * Once upon a time, on a way through the old wild mountainous west,…
 */
public class DirReduction {
    public static String[] dirReduc(String[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (("NORTH".equals(arr[i]) && "SOUTH".equals(arr[i + 1])) ||
                    ("SOUTH".equals(arr[i]) && "NORTH".equals(arr[i + 1])) ||
                    ("EAST".equals(arr[i]) && "WEST".equals(arr[i + 1])) ||
                    ("WEST".equals(arr[i]) && "EAST".equals(arr[i + 1]))) {
                arr[i] = null;
                arr[i + 1] = null;
            }
        }
        String[] newArr = Arrays.stream(arr)
                .filter(Objects::nonNull)
                .toArray(String[]::new);
        if (newArr.length == arr.length) {
            return arr;
        } else {
            return dirReduc(newArr);
        }

        /*List<String> dirs = new ArrayList<String>(Arrays.asList(arr));
        for (int i = 0; i + 1 < dirs.size(); i++) {
            if ("NORTHSOUTH,SOUTHNORTH,EASTWEST,WESTEAST".contains(dirs.get(i) + dirs.get(i + 1))) {
                dirs.remove(i + 1);
                dirs.remove(i);
                i = -1;
            }
        }
        return dirs.toArray(new String[dirs.size()]);*/
    }
}
