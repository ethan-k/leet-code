package leecode;

import java.util.HashMap;
import java.util.Map;

public class MiddleOfTheLinkedList {

  public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }

  public static void main(String[] args) {

  }

  int count = 0;
  Map<Integer, ListNode> nodeMap = new HashMap<>();

  public ListNode middleNode(ListNode head) {
    middleNodeHelper(head);
    int i = count / 2;
    return nodeMap.get(i + 1);
  }

  public void middleNodeHelper(ListNode node) {
    if (node == null) {
      return;
    }
    count++;
    nodeMap.put(count, node);
    middleNodeHelper(node.next);
  }
}
