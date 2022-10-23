package tast242;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> chars = new HashMap<>();
        for(Character c: s.toCharArray()) {
            if (chars.containsKey(c)) {
                chars.put(c, chars.get(c) + 1);
            } else {
                chars.put(c, 1);
            }
        }

        for(Character c: t.toCharArray()) {
            if (!chars.containsKey(c)) {
                return false;
            } else {
                int count = chars.get(c);
                if (count == 0) {
                    return false;
                } else {
                    chars.put(c, count - 1);
                }
            }
        }

        return true;
    }
}
