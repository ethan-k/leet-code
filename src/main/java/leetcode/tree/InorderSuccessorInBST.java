package leetcode.tree;

import java.util.Comparator;
import java.util.TreeSet;

public class InorderSuccessorInBST {
  TreeSet<TreeNode> set = new TreeSet<>(Comparator.comparingInt(a -> a.val));

  public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
    traverse(root);

    return set.higher(p);
  }

  public void traverse(TreeNode node) {
    if (node == null)
      return;

    set.add(node);
    traverse(node.left);
    traverse(node.right);
  }
}
