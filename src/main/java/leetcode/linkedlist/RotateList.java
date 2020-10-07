package leetcode.linkedlist;

import leetcode.util.ListNode;

import java.util.LinkedList;

public class RotateList {
  public ListNode rotateRightWithLinkedList(ListNode head, int k) {
    if (head == null)
      return null;
    int length = 0;
    LinkedList<ListNode> list = new LinkedList<>();

    while (head != null) {
      list.add(head);
      head = head.next;
    }

    k = k % list.size();
    for (int i = 0; i < k; i++) {
      list.addFirst(list.removeLast());
    }
    list.getLast().next = null;

    ListNode iter = new ListNode(0);
    ListNode dummy = iter;
    int size = list.size();
    for (int i = 0; i < size; i++) {
      iter.next = list.removeFirst();
      iter = iter.next;
    }
    return dummy.next;
  }

  public ListNode rotateRight(ListNode head, int k) {
    if (head == null)
      return null;

    if (head.next == null)
      return head;

    ListNode tail = head;
    int length = 0;
    while (true) {
      length++;
      if (tail.next == null)
        break;
      tail = tail.next;
    }
    tail.next = head;
    k = k % length;

    ListNode newTail = head;
    for (int i = 1; i < length - k; i++) {
      newTail = newTail.next;
    }
    head = newTail.next;
    newTail.next = null;

    return head;
  }
}
