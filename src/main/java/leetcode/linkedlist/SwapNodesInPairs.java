package leetcode.linkedlist;

import leetcode.util.ListNode;

public class SwapNodesInPairs {
  public ListNode swapPairs(ListNode head) {

    ListNode cur = head;
    ListNode dummy = new ListNode(0);
    dummy.next = cur;
    ListNode prev = dummy;

    while (cur != null && cur.next != null) {
      ListNode nextCur = cur.next.next;
      ListNode next = cur.next;
      prev.next = next;
      next.next = cur;
      cur.next = nextCur;

      prev = cur;
      cur = nextCur;
    }

    return dummy.next;
  }
}
