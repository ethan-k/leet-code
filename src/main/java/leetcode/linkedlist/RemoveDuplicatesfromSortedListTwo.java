package leetcode.linkedlist;

import leetcode.util.ListNode;

public class RemoveDuplicatesfromSortedListTwo {

    public ListNode deleteDuplicates(ListNode head) {


        ListNode dummy = new ListNode(-200);

        ListNode prev = dummy;
        ListNode cur = head;
        dummy.next = head;

        while (cur != null) {

            boolean isDuplicate = false;
            while (cur.next != null) {
                if (cur.val != cur.next.val)
                    break;
                cur = cur.next;
                isDuplicate = true;
            }

            if (isDuplicate) {
                prev.next = null;
                cur = cur.next;
            } else {
                prev.next = cur;
                prev = cur;
                cur = cur.next;
            }
        }

        return dummy.next;
    }


}
