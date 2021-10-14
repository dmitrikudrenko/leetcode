package task1351;

public class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++) {
            int[] row = grid[i];
            for(int j = row.length - 1; j >= 0; j--) {
                if (row[j] < 0) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }
}
