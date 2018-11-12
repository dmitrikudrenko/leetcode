package task15;

import java.util.*;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 */
public class Solution {
    private static final int SUM = 0;

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Set<Triple> triples = new HashSet<Triple>();
        if (nums.length < 3) {
            return result;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];
            for (int j = nums.length - 1; j > i + 1; j--) {
                int second = nums[j];
                int third = SUM - first - second;
                boolean thirdExists = find(third, nums, i + 1, j) >= 0;
                if (thirdExists) {
                    triples.add(new Triple(first, second, third));
                }
            }
        }
        for (Triple triple : triples) {
            result.add(triple.toList());
        }
        return result;
    }

    private static int find(int what, int[] where, int start, int end) {
        return Arrays.binarySearch(where, start, end, what);
    }

    private static class Triple {
        private final int[] numbers;

        public Triple(int first, int second, int third) {
            numbers = new int[] {first, second, third};
            Arrays.sort(numbers);
        }

        @Override
        public boolean equals(Object o) {
            Triple triple = (Triple) o;

            if (numbers[0] != triple.numbers[0]) return false;
            if (numbers[1] != triple.numbers[1]) return false;
            return numbers[2] == triple.numbers[2];
        }

        @Override
        public int hashCode() {
            int result = numbers[0];
            result = 31 * result + numbers[1];
            result = 31 * result + numbers[2];
            return result;
        }

        public List<Integer> toList() {
            return Arrays.asList(numbers[0], numbers[1], numbers[2]);
        }
    }
}
