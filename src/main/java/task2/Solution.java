package task2;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            return String.valueOf(val);
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode current1 = l1;
        ListNode current2 = l2;
        ListNode result = null;
        ListNode resultCurrentPointer = null;
        int modula = 0;
        while (current1 != null || current2 != null) {
            int sum = (current1 != null ? current1.val : 0)
                    + (current2 != null ? current2.val : 0);
            sum += modula;
            ListNode newNode = new ListNode(sum % 10);
            modula = sum / 10;
            if (result == null) {
                result = newNode;
                resultCurrentPointer = result;
            } else {
                resultCurrentPointer.next = newNode;
                resultCurrentPointer = newNode;
            }

            if (current1 != null) {
                current1 = current1.next;
            }

            if (current2 != null) {
                current2 = current2.next;
            }
        }
        if (modula != 0) {
            resultCurrentPointer.next = new ListNode(modula);
        }
        return result;
    }
}
