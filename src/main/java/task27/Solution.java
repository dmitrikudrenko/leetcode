package task27;

/**
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * */

public class Solution {
    public int removeElement(int[] nums, int val) {
        int result = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == Integer.MIN_VALUE) {
                break;
            } else if (nums[i] != val) {
                result++;
                i++;
            } else {
                removeIndex(nums, i);
            }
        }
        return result;
    }

    public static void removeIndex(int[] array, int index) {
        for (int i = index; i < array.length; i++) {
            if (i == array.length - 1) {
                array[i] = Integer.MIN_VALUE;
            } else {
                array[i] = array[i + 1];
            }
        }
    }
}
