package leetcode;

import java.util.HashMap;
import java.util.Map;

public class LinkedListCycle {

	public boolean hasCycle(ListNode head) {
		if (head == null) {
			return false;
		}
		Map<ListNode, Integer> map = new HashMap<>();
		while(head.next !=null) {
			head = head.next;
			int val = map.getOrDefault(head, 1);
			if (val != 1) {
				return true;
			} else {
				map.put(head, val + 1);
			}
		}
		return false;
	}

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
}
