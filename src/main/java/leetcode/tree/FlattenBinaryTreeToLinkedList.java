package leetcode.tree;

public class FlattenBinaryTreeToLinkedList {
  public void flatten(TreeNode root) {
    flattenTree(root);
  }

  public TreeNode flattenTree(TreeNode root) {

    if (root == null) {
      return null;
    }

    TreeNode leftTail = flattenTree(root.left);
    TreeNode rightTail = flattenTree(root.right);
    if (leftTail == null && rightTail == null)
      return root;

    if (leftTail != null) {
      leftTail.right = root.right;
      root.right = root.left;
      root.left = null;
    }

    return rightTail == null ? leftTail : rightTail;

  }
}
