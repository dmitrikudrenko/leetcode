package task21;

/**
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 */
public class Solution {
    public static class ListNode {
        public final int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode currentFirst = l1;
        ListNode currentSecond = l2;
        ListNode result = null;
        ListNode currentResult = null;
        while (currentFirst != null || currentSecond != null) {
            int currentFirstValue = currentFirst != null ? currentFirst.val : Integer.MAX_VALUE;
            int currentSecondValue = currentSecond != null ? currentSecond.val : Integer.MAX_VALUE;
            if (currentFirstValue <= currentSecondValue) {
                if (result == null) {
                    result = new ListNode(currentFirstValue);
                    currentResult = result;
                } else {
                    currentResult.next = new ListNode(currentFirstValue);
                    currentResult = currentResult.next;
                }
                currentFirst = currentFirst.next;
            } else {
                if (result == null) {
                    result = new ListNode(currentSecondValue);
                    currentResult = result;
                } else {
                    currentResult.next = new ListNode(currentSecondValue);
                    currentResult = currentResult.next;
                }
                currentSecond = currentSecond.next;
            }
        }
        return result;
    }
}
