package leetcode.linkedlist;

import leetcode.util.ListNode;

public class PalindromeLinkedList {
  public boolean isPalindrome(ListNode head) {
    ListNode dummy = head;
    int count = 0;
    while (dummy != null) {
      count++;
      dummy = dummy.next;
    }

    int[] values = new int[count];

    dummy = head;
    int i = 0;
    while (dummy != null) {
      values[i++] = dummy.val;
      dummy = dummy.next;
    }

    int j = count - 1;
    i = 0;

    while (i <= j) {
      if (values[i] != values[j])
        return false;
      i++;
      j--;
    }

    return true;
  }
}
