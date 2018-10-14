package task14;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String minLengthString = null;
        for (String str : strs) {
            if (minLengthString == null) {
                minLengthString = str;
            } else if (minLengthString.length() > str.length()) {
                minLengthString = str;
            }
        }
        if (minLengthString == null) {
            throw new RuntimeException("WTF???");
        }
        for (int i = minLengthString.length(); i > 0; i--) {
            String substring = minLengthString.substring(0, i);
            boolean isSubstringFailed = false;
            for (String str : strs) {
                if (!str.startsWith(substring)) {
                    isSubstringFailed = true;
                    break;
                }
            }
            if (!isSubstringFailed) {
                return substring;
            }
        }
        return "";
    }
}
