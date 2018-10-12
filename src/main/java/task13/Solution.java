package task13;

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * For example, two is written as II in Roman numeral, just two one's added together. Twelve is written as, XII, which is simply X + II. The number twenty seven is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be within the range from 1 to 3999
 */
public class Solution {
    private static final char ONE = 'I';
    private static final char FIVE = 'V';
    private static final char TEN = 'X';
    private static final char FIFTY = 'L';
    private static final char HUNDRED = 'C';
    private static final char FIVE_HUNDRED = 'D';
    private static final char THOUSAND = 'M';

    private static final char NO_CHAR = 'N';

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int result = 0;
        int length = chars.length;
        for (int i = 0; i < length; i++) {
            char current = chars[i];
            boolean isLastChar = i == length - 1;
            char next = isLastChar ? NO_CHAR : chars[i + 1];
            int diff;
            switch (current) {
                case ONE:
                    diff = isGreaterOrEqual(current, next) ? 1 : -1;
                    break;
                case FIVE:
                    diff = isGreaterOrEqual(current, next) ? 5 : -5;
                    break;
                case TEN:
                    diff = isGreaterOrEqual(current, next) ? 10 : -10;
                    break;
                case FIFTY:
                    diff = isGreaterOrEqual(current, next) ? 50 : -50;
                    break;
                case HUNDRED:
                    diff = isGreaterOrEqual(current, next) ? 100 : -100;
                    break;
                case FIVE_HUNDRED:
                    diff = isGreaterOrEqual(current, next) ? 500 : -500;
                    break;
                case THOUSAND:
                    diff = isGreaterOrEqual(current, next) ? 1000 : -1000;
                    break;
                default:
                    throw new IllegalArgumentException("Unknown number");
            }
            result += diff;
        }
        return result;
    }

    //is number1 is greater than number2
    private static boolean isGreaterOrEqual(char number1, char number2) {
        if (number1 == number2) {
            return true;
        }
        if (number2 == NO_CHAR) {
            return true;
        }
        switch (number1) {
            case ONE:
                return false;
            case FIVE:
                return number2 == ONE;
            case TEN:
                return number2 == ONE || number2 == FIVE;
            case FIFTY:
                return number2 == ONE || number2 == FIVE || number2 == TEN;
            case HUNDRED:
                return number2 == ONE || number2 == FIVE || number2 == TEN || number2 == FIFTY;
            case FIVE_HUNDRED:
                return number2 == ONE || number2 == FIVE || number2 == TEN || number2 == FIFTY || number2 == HUNDRED;
            case THOUSAND:
                return true;
            default:
                throw new IllegalArgumentException("Unexpected first number");
        }

    }
}
