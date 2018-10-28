package task26;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void test1() {
        int[] array = {1, 1, 2};
        int result = solution.removeDuplicates(array);
        assertEquals(2, result);
    }

    @Test
    void test2() {
        int[] array = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = solution.removeDuplicates(array);
        assertEquals(5, result);
    }
}
