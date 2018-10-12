package task7;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 */

public class Solution {
    public int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        if (x == Integer.MAX_VALUE) {
            return 0;
        }

        boolean negative = x < 0;
        int positiveX = negative ? -x : x;
        long result = 0;
        while (true) {
            int modulo = positiveX % 10;
            result = result * 10 + modulo;
            if (positiveX >= 10) {
                positiveX /= 10;
            } else {
                break;
            }
        }
        result = negative ? -result : result;
        if (result <= Integer.MAX_VALUE && result >= Integer.MIN_VALUE) {
            return (int) result;
        } else {
            return 0;
        }
    }
}
