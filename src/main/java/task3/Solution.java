package task3;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || "".equals(s)) {
            return 0;
        }

        Map<Character, Boolean> used;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            used = new HashMap<Character, Boolean>();
            int currentLength = 0;
            for (int j = i; j < s.length(); j++) {
                char current = s.charAt(j);
                if (used.containsKey(current)) {
                    break;
                } else {
                    used.put(current, true);
                    currentLength++;
                }
            }
            if (currentLength > max) {
                max = currentLength;
            }
        }
        return max;
    }
}
