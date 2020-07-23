package leetcode.tree;

public class HouseRobberThree {
  public int rob(TreeNode root) {
    helper(root, false);
    return max;
  }
  int max = 0;

  int helper(TreeNode root, boolean isParentRobbed) {
    if (root == null) {
      return 0;
    }

    int val =0;
    if (!isParentRobbed) {
      int taken = root.val + helper(root.left, true) + helper(root.right, true);
      int nottaken = helper(root.left, false) + helper(root.right, false);
      val = Math.max(taken, nottaken);
    } else {
      val = helper(root.left, false) + helper(root.right, false);
    }

    max = Math.max(max, val);

    return val;
  }
}
