package leetcode.linkedlist;

public class RotateList {
  public ListNode rotateRight(ListNode head, int k) {
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
}
