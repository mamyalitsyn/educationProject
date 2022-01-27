package codewars.lvl5;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Pattern;

/**
 * Phone Directory
 * @see <a href="https://www.codewars.com/kata/56baeae7022c16dd7400086e">Kata link</a>
 * <p>
 * John keeps a backup of his old personal phone book as a text file.
 * On each line of the file he can find the phone number
 * (formated as +X-abc-def-ghij where X stands for one or two digits),
 * the corresponding name between < and > and the address.
 */
public class PhoneDir {
    public static  String phone(String strng, String num) {
        if (!strng.contains("+" + num)) return String.format("Error => Not found: %s", num);
        if (StringUtils.countMatches(strng, "+" + num) > 1) return String.format("Error => Too many people: %s", num);
        for (String s : strng.split("\n")) {
            if (s.contains("+" + num)) {
                var nameMatcher = Pattern.compile("<[\\s\\S]*>").matcher(s);
                var name = nameMatcher.find() ? nameMatcher.group() : "";
                var address = s.replace("+" + num, "")
                        .replace(name, "")
                        .replaceAll("[^a-zA-Z0-9.\\-]", " ")
                        .replaceAll("\\s{2,}", " ")
                        .trim();
                return String.format("Phone => %s, Name => %s, Address => %s", num, name.substring(1, name.length()-1), address);
            }
        }
        return "";
    }
}
