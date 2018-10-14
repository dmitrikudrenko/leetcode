package task14;

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
        String result = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});
        assertEquals("fl", result);
    }

    @Test
    void test2() {
        String result = solution.longestCommonPrefix(new String[]{"dog","racecar","car"});
        assertEquals("", result);
    }

    @Test
    void test3() {
        String result = solution.longestCommonPrefix(new String[]{});
        assertEquals("", result);
    }

    @Test
    void test4() {
        String result = solution.longestCommonPrefix(new String[]{"ca", "a"});
        assertEquals("", result);
    }
}
