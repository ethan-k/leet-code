package leetcode.tree;

public class ClosestBinarySearchTreeValue {
  double diff = Double.MAX_VALUE;
  int ret;
  double target;
  public int closestValue(TreeNode root, double target) {
    this.target = target;
    ret = root.val;
    traverse(root);
    return ret;
  }

  void traverse(TreeNode n) {
    if (n == null)
      return;

    if (Math.abs(target - n.val) < diff) {
      diff = Math.abs(target - n.val);
      ret = n.val;
    }

    traverse(n.left);
    traverse(n.right);

  }
}
