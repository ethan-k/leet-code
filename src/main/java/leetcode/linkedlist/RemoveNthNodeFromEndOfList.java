package leetcode.linkedlist;

import leetcode.util.ListNode;

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = head;

        int length = 0;
        while (dummy != null) {
            dummy = dummy.next;
            length++;
        }

        int target = length - n;
        dummy = new ListNode(0);
        ListNode prev = dummy;
        prev.next = head;
        ListNode cur = head;

        for (int i = 0; i < target; i++) {
            prev = cur;
            cur = cur.next;
        }

        prev.next = cur.next;

        return dummy.next;
    }
}
