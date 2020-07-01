package leetcode;

import leetcode.model.TreeNode;

public class RangeSumOfBST {
  private int sum = 0;

  public int rangeSumBST(TreeNode root, int L, int R) {
    rangeSumBSTHelper(root, L, R);
    return sum;
  }

  public void rangeSumBSTHelper(TreeNode root, int L, int R) {
    if (root == null) {
      return;
    }
    rangeSumBSTHelper(root.left, L, R);
    if (root.val >= L && root.val <= R) {
      sum += root.val;
    }
    rangeSumBSTHelper(root.right, L, R);
  }
}
