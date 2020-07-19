package leetcode.linkedlist;

import leetcode.util.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class SortList {
  public ListNode sortList(ListNode head) {
    // constant space
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    PriorityQueue<ListNode> q = new PriorityQueue<>(Comparator.comparingInt(a -> a.val));
    while (head != null) {
      q.offer(head);
      head = head.next;
    }
    ListNode dummy1 = new ListNode(0);
    ListNode dummy2 = new ListNode(0);
    dummy2.next = dummy1;

    while (!q.isEmpty()) {
      dummy1.next = new ListNode(q.poll().val);
      dummy1 = dummy1.next;
    }
    return dummy2.next.next;
  }
}
