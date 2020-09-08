package leetcode.tree;

import java.util.*;

import leetcode.model.TreeNode;

public class AllElementsInTwoBinarySearchTrees {
  List<Integer> list = new ArrayList<>();

  public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
    traverse(root1);
    traverse(root2);

    Collections.sort(list);

    return list;
  }

  void traverse(TreeNode n) {
    if (n == null)
      return;

    list.add(n.val);
    traverse(n.left);
    traverse(n.right);
  }
}
