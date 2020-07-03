package leetcode.tree;

public class PathSum {
  boolean found = false;

  public boolean hasPathSum(TreeNode root, int sum) {
    traverse(root, sum);
    return found;
  }

  void traverse(TreeNode node, int sum) {
    if (node == null) {
      return;
    }
    int curSum = sum - node.val;
    if (node.left == null && node.right == null && curSum == 0) {
      found = true;
      return;
    }
    traverse(node.left, curSum);
    traverse(node.right, curSum);
  }
}
