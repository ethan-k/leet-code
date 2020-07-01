package leetcode;

public class MergeTwoSortedLists {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(4);
		ListNode l4 = new ListNode(3);
		ListNode l5 = new ListNode(5);
		ListNode l6 = new ListNode(6);
				l1.next = l2;
		l2.next = l3;
		l4.next = l5;
		l5.next = l6;
		mergeTwoLists(l1, l2);

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return null;
		} else if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}
		ListNode first = null;
		ListNode firstPointer = null;
		ListNode second = null;
		ListNode secondPointer = null;

		if (l1.val < l2.val) {
			first = l1;
			second = l2;
		} else {
			first = l2;
			second = l1;
		}

		firstPointer = first;
		secondPointer = second;
		while (firstPointer.next != null) {
			if (firstPointer.next.val > second.val) {
				secondPointer = second.next;
				second.next = firstPointer.next;
				firstPointer.next = second;
				second = secondPointer;
			}
			firstPointer = firstPointer.next;
			if (second == null) {
				break;
			}
		}
		if (secondPointer != null) {
			firstPointer.next = secondPointer;
		}
		return first;
	}


	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) { val = x; }
	}
}
