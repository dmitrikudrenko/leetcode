package task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionsTest {
    private Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void test1() {
        Solution.ListNode ln11 = new Solution.ListNode(2);
        Solution.ListNode ln12 = new Solution.ListNode(4);
        ln11.next = ln12;
        Solution.ListNode ln13 = new Solution.ListNode(3);
        ln12.next = ln13;

        Solution.ListNode ln21 = new Solution.ListNode(5);
        Solution.ListNode ln22 = new Solution.ListNode(6);
        ln21.next = ln22;
        Solution.ListNode ln23 = new Solution.ListNode(4);
        ln22.next = ln23;

        Solution.ListNode result = solution.addTwoNumbers(ln11, ln21);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
    }

    @Test
    void test2() {
        Solution.ListNode ln11 = new Solution.ListNode(2);
        Solution.ListNode ln12 = new Solution.ListNode(4);
        ln11.next = ln12;
        Solution.ListNode ln13 = new Solution.ListNode(3);
        ln12.next = ln13;

        Solution.ListNode ln21 = new Solution.ListNode(5);
        Solution.ListNode ln22 = new Solution.ListNode(6);
        ln21.next = ln22;
        Solution.ListNode ln23 = new Solution.ListNode(4);
        ln22.next = ln23;
        Solution.ListNode ln24 = new Solution.ListNode(1);
        ln23.next = ln24;

        Solution.ListNode result = solution.addTwoNumbers(ln11, ln21);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
        assertEquals(1, result.next.next.next.val);
    }

    @Test
    void test3() {
        Solution.ListNode ln11 = new Solution.ListNode(5);
        Solution.ListNode ln21 = new Solution.ListNode(5);

        Solution.ListNode result = solution.addTwoNumbers(ln11, ln21);
        assertEquals(0, result.val);
        assertEquals(1, result.next.val);
    }
}
