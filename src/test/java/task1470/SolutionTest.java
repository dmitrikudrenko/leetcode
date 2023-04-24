package task1470;

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
        int[] array = {2, 5, 1, 3, 4, 7};
        int[] result = solution.shuffle(array, 3);
        assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, result);
    }

    @Test
    void test2() {
        int[] array = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] result = solution.shuffle(array, 4);
        assertArrayEquals(new int[]{1, 4, 2, 3, 3, 2, 4, 1}, result);
    }

    @Test
    void test3() {
        int[] array = {1, 1, 2, 2};
        int[] result = solution.shuffle(array, 2);
        assertArrayEquals(new int[]{1, 2, 1, 2}, result);
    }
}
