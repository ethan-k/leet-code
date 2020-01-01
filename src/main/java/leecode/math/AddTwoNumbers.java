package leecode.math;


class ListNode {
  int val;
  ListNode next;

  ListNode(int x) {
    val = x;
  }
}

public class AddTwoNumbers {

  public static void main(String[] args) {

    ListNode l11 = new ListNode(2);
    ListNode l21 = new ListNode(5);
    ListNode l22 = new ListNode(6);
    l21.next = l22;
    System.out.println(new AddTwoNumbers().addTwoNumbers(l11, l21));
  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    ListNode ret = null;
    ListNode prev = null;
    int carry = 0;

    while (l1 != null || l2 != null || carry != 0) {

      ListNode cur = new ListNode(0);
      int sum = carry;
      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }
      cur.val = sum % 10;
      carry = sum / 10;
      if (ret == null) {
        ret = cur;
      } else {
        prev.next = cur;
      }
      prev = cur;
    }

    return ret;

  }
}
