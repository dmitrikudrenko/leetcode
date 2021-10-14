package task2032;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Map<Integer, int[]> map = new HashMap<>();

        fill(map, nums1, 0);
        fill(map, nums2, 1);
        fill(map, nums3, 2);

        List<Integer> res = new LinkedList<>();
        for(Map.Entry<Integer, int[]> entry: map.entrySet()) {
            int count = 0;
            int[] array = entry.getValue();
            for(int i = 0; i < 3; i++) {
                if (array[i] > 0) count++;
            }
            if (count > 1) res.add(entry.getKey());
        }
        return res;
    }

    private void fill(Map<Integer, int[]> map, int[] nums, int level) {
        for(int element: nums) {
            if (!map.containsKey(element)) {
                int[] array = new int[3];
                array[level]++;
                map.put(element, array);
            } else {
                map.get(element)[level]++;
            }
        }
    }
}
