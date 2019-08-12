import leecode.model.TreeNode;

class BinarySearchTreeToGreaterSumTree {

  private int sum = 0;

  public TreeNode bstToGst(TreeNode root) {

      interbstToGst(root);
      return root;
    }

    public void interbstToGst(TreeNode root) {
      if (root == null) {
        return;
      }

    interbstToGst(root.right);
    sum += root.val;
    root.val = sum;
    interbstToGst(root.left);

  }
}