package leecode;

/*
	Reverse a singly linked list.
 */
public class ReverseLinkedList {

	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

	public static void main(String ...args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		ListNode n = reverseListIteratively(n1);
		do {
			System.out.println(n.val);
			n = n.next;
		} while (n.next != null);
	}

//	public static ListNode reverseListRecursively(ListNode node) {
//
//	}

	public static ListNode reverseListIteratively(ListNode head) {
		if (head == null) {
			return null;
		}
		ListNode initFirstN = head;
		while (initFirstN.next != null) {
			ListNode tmp = initFirstN.next;
			initFirstN.next = tmp.next;
			tmp.next = head;
			head = tmp;
		}

		return head;
	}
}
