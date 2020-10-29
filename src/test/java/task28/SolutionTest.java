package task28;

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
        assertEquals(2, solution.strStr("hello", "ll"));
    }

    @Test
    void test2() {
        assertEquals(-1, solution.strStr("aaaaa", "baa"));
    }

    @Test
    void test3() {
        assertEquals(0, solution.strStr("", ""));
    }
}
