package leetcode.tree;

import leetcode.model.TreeNode;

class InsertintoABinarySearchTree {
  public TreeNode insertIntoBST(TreeNode root, int val) {
    if (root == null)
      return new TreeNode(val);

    traverse(root, val);
    return root;
  }

  void traverse(TreeNode n, int val) {
    if (n == null)
      return;

    if (n.val < val) {
      if (n.right == null) {
        n.right = new TreeNode(val);
      } else {
        traverse(n.right, val);
      }
    } else {
      if (n.left == null) {
        n.left = new TreeNode(val);
      } else {
        traverse(n.left, val);
      }
    }
  }
}