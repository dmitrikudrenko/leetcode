package task20;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void test1() {
        boolean result = solution.isValid("()");
        assertTrue(result);
    }

    @Test
    void test2() {
        boolean result = solution.isValid("()[]{}");
        assertTrue(result);
    }

    @Test
    void test3() {
        boolean result = solution.isValid("(]");
        assertFalse(result);
    }

    @Test
    void test4() {
        boolean result = solution.isValid("([)]");
        assertFalse(result);
    }

    @Test
    void test5() {
        boolean result = solution.isValid("{[]}");
        assertTrue(result);
    }
}
