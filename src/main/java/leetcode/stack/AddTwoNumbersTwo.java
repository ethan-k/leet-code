package leetcode.stack;


import leetcode.util.ListNode;

import java.util.Stack;

public class AddTwoNumbersTwo {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode head = null;
        ListNode prev = null;
        while (carry != 0 || !stack1.isEmpty() || !stack2.isEmpty()) {
            int tmp = carry;
            carry = 0;

            if (!stack1.isEmpty()) {
                tmp += stack1.pop();
            }
            if (!stack2.isEmpty()) {
                tmp += stack2.pop();
            }
            if (tmp > 9) {
                carry++;
                tmp = tmp % 10;
            }

            head = new ListNode(tmp);
            head.next = prev;
            prev = head;

        }

        return head;
    }
}
