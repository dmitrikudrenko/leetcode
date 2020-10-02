package task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SolutionTest {
    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void test1() {
        Assertions.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void test2() {
        Assertions.assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void test3() {
        Assertions.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    void test4() {
        Assertions.assertEquals(0, solution.lengthOfLongestSubstring(""));
    }
}
