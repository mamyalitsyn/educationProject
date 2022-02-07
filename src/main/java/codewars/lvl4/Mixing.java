package codewars.lvl4;

import org.apache.commons.lang3.CharUtils;

import java.util.*;

/**
 * Strings Mix
 * @see <a href="https://www.codewars.com/kata/5629db57620258aa9d000014/">Kata link</a>
 * <p>
 * Given two strings s1 and s2, we want to visualize how different the two strings are.
 * We will only take into account the lowercase letters (a to z).
 */
public class Mixing {
    public static String mix(String s1, String s2) {
        var s1Distincted = distinct(s1);
        var s2Distincted = distinct(s2);
        Map<Character, Integer> distincted = new HashMap<>(s1Distincted);
        s2Distincted.forEach(
                (key, value) -> distincted.merge( key, value, (v1, v2) -> v1>v2 ? v1 : v2)
        );
        Map<Character, Map<Integer, Integer>> anchorMap = new HashMap<>();
        for (var entry : distincted.entrySet()) {
            int firstCount = s1Distincted.getOrDefault(entry.getKey(), 0);
            int secondCount = s2Distincted.getOrDefault(entry.getKey(), 0);
            if (Math.max(firstCount, secondCount) > 1) {
                if (firstCount == secondCount) anchorMap.put(entry.getKey(), Collections.singletonMap(0, firstCount));
                else if (firstCount > secondCount) anchorMap.put(entry.getKey(), Collections.singletonMap(1, firstCount));
                else anchorMap.put(entry.getKey(), Collections.singletonMap(2, secondCount));
            }
        }
        ArrayList<String> strings = new ArrayList<>();
        for (var entry : anchorMap.entrySet()) {
            StringBuilder sb = new StringBuilder();
            int id = entry.getValue().keySet().iterator().next();
            int count = entry.getValue().get(id);
            sb.append(id == 0 ? "=" : id);
            sb.append(":");
            sb.append(String.valueOf(entry.getKey()).repeat(count));
            strings.add(sb.toString());
        }
        strings.sort(
                Comparator.comparing(String::length)
                        .reversed()
                        .thenComparing(s -> s.charAt(0))
                        .thenComparing(s -> s.charAt(s.length() - 1)));
        return String.join("/", strings);
    }

    static Map<Character, Integer> distinct(String s) {
        Map<Character, Integer> toReturn = new HashMap<>();
        var chars = s.toCharArray();
        for (char c : chars) {
            if (CharUtils.isAsciiAlpha(c) && Character.isLowerCase(c)) {
                if(toReturn.containsKey(c)) {
                    int counter = toReturn.get(c);
                    toReturn.put(c, ++counter);
                } else {
                    toReturn.put(c, 1);
                }
            }
        }
        return toReturn;
    }
}
