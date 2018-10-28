package task21;

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
        Solution.ListNode l11 = new Solution.ListNode(1);
        Solution.ListNode l12 = new Solution.ListNode(2);
        Solution.ListNode l13 = new Solution.ListNode(4);
        l11.next = l12;
        l12.next = l13;

        Solution.ListNode l21 = new Solution.ListNode(1);
        Solution.ListNode l22 = new Solution.ListNode(3);
        Solution.ListNode l23 = new Solution.ListNode(4);
        l21.next = l22;
        l22.next = l23;

        Solution.ListNode result = solution.mergeTwoLists(l11, l21);
        assertEquals(1, result.val);
        result = result.next;

        assertEquals(1, result.val);
        result = result.next;

        assertEquals(2, result.val);
        result = result.next;

        assertEquals(3, result.val);
        result = result.next;

        assertEquals(4, result.val);
        result = result.next;

        assertEquals(4, result.val);
    }
}
