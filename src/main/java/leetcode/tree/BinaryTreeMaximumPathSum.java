package leetcode.tree;

import leetcode.model.TreeNode;

class BinaryTreeMaximumPathSum {
  public int maxPathSum(TreeNode root) {
    helper(root);
    return maxVal;
  }

  int maxVal = Integer.MIN_VALUE;

  int helper(TreeNode n) {

    if (n == null)
      return 0;

    int leftGain = helper(n.left);
    int rightGain = helper(n.right);

    int currentMax = Math.max(leftGain + n.val, Math.max(rightGain + n.val, n.val));

    maxVal = Math.max(currentMax, Math.max(leftGain + n.val + rightGain, maxVal));
    return currentMax;
  }
}