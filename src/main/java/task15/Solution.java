package task15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.binarySearch;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 */
public class Solution {
    private static final int SUM = 0;

    public List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        if (length < 3) {
            return new ArrayList<List<Integer>>();
        }

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < length - 2; i++) {
            int first = nums[i];
            if (first > SUM) {
                continue;
            }
            if (i > 0 && first == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < length - 1; j++) {
                int second = nums[j];
                int third = SUM - first - second;
                if (j > i + 1 && second == nums[j - 1]) {
                    continue;
                }
                if (third < second) {
                    break;
                }

                boolean thirdExists = binarySearch(nums, j + 1, length, third) >= 0;
                if (thirdExists) {
                    result.add(Arrays.asList(first, second, third));
                    continue;
                }
            }
        }
        return result;
    }
}
