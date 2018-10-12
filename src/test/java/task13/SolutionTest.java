package task13;

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
        int result = solution.romanToInt("III");
        assertEquals(3, result);
    }

    @Test
    void test2() {
        int result = solution.romanToInt("IV");
        assertEquals(4, result);
    }

    @Test
    void test3() {
        int result = solution.romanToInt("IX");
        assertEquals(9, result);
    }

    @Test
    void test4() {
        int result = solution.romanToInt("LVIII");
        assertEquals(58, result);
    }

    @Test
    void test5() {
        int result = solution.romanToInt("MCMXCIV");
        assertEquals(1994, result);
    }
}
