package task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static task1.Solution.twoSum;

public class SolutionTest {
    @Test
    void test1() {
        int[] result = twoSum(new int[]{2, 7, 11, 15}, 9);
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, result);
    }

    @Test
    void test2() {
        int[] result = twoSum(new int[]{3, 2, 4}, 6);
        int[] expected = new int[]{1, 2};
        assertArrayEquals(expected, result);
    }
}
