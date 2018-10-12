package task9;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        char[] xAsCharArray = String.valueOf(x).toCharArray();
        int length = xAsCharArray.length;
        for (int i = 0; i < length / 2; i++) {
            if (xAsCharArray[i] != xAsCharArray[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
