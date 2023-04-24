package task1480;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void test1() {
        int[] array = {1, 2, 3, 4};
        int[] result = solution.runningSum(array);
        assertArrayEquals(new int[]{1, 3, 6, 10}, result);
    }

    @Test
    void test2() {
        int[] array = {1, 1, 1, 1, 1};
        int[] result = solution.runningSum(array);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, result);
    }

    @Test
    void test3() {
        int[] array = {3, 1, 2, 10, 1};
        int[] result = solution.runningSum(array);
        assertArrayEquals(new int[]{3, 4, 6, 16, 17}, result);
    }
}
