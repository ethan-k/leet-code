package leetcode.tree;

import leetcode.util.ListNode;
import java.util.*;

public class ConvertSortedListToBinarySearchTree {
  public TreeNode sortedListToBST(ListNode head) {
    ListNode n = head;
    List<Integer> list = new ArrayList<>();

    while(n != null) {
      list.add(n.val);
      n = n.next;
    }


    return sortedListToBST(list, 0, list.size() -1 );
  }

  public TreeNode sortedListToBST(List<Integer> list, int left, int right) {

    if (left > right) {
      return null;
    }

    int middle = (left+right) / 2;
    int cur = list.get(middle);

    TreeNode n = new TreeNode(cur);

    if (left == right)
      return n;

    n.left = sortedListToBST(list, left, middle-1);
    n.right = sortedListToBST(list, middle+1, right);

    return n;
  }
}
