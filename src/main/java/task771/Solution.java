package task771;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 *
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * */

public class Solution {
    public static int numJewelsInStones(String J, String S) {
        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (contains(J, S.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static boolean contains(String string, char ch) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
        System.out.println(numJewelsInStones("z", "ZZ"));
    }
}
