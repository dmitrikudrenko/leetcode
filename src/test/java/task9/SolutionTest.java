package task9;

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
        boolean palindrome = solution.isPalindrome(121);
        assertTrue(palindrome);
    }

    @Test
    void test2() {
        boolean palindrome = solution.isPalindrome(-121);
        assertFalse(palindrome);
    }

    @Test
    void test3() {
        boolean palindrome = solution.isPalindrome(10);
        assertFalse(palindrome);
    }
}
