package task7;

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
        int reversed = solution.reverse(123);
        assertEquals(321, reversed);
    }

    @Test
    void test2() {
        int reversed = solution.reverse(-123);
        assertEquals(-321, reversed);
    }

    @Test
    void test3() {
        int reversed = solution.reverse(120);
        assertEquals(21, reversed);
    }

    @Test
    void test4() {
        int reversed = solution.reverse(10);
        assertEquals(1, reversed);
    }

    @Test
    void test5() {
        int reversed = solution.reverse(1534236469);
        assertEquals(0, reversed);
    }

    @Test
    void test6() {
        int reversed = solution.reverse(-2147483648);
        assertEquals(0, reversed);
    }
}
