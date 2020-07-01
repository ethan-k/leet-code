package leetcode.tree;

import java.util.HashSet;
import java.util.Set;

public class UnivaluedBinaryTree {
  Set<Integer> set = new HashSet<>();

  public boolean isUnivalTree(TreeNode root) {
    traverse(root);
    return set.size() == 1;
  }

  void traverse(TreeNode root) {
    if (root == null)
      return;
    this.set.add(root.val);
    traverse(root.left);
    traverse(root.right);
  }
}
