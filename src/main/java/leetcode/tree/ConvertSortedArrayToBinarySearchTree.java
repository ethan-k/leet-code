package leetcode.tree;

public class ConvertSortedArrayToBinarySearchTree {
  int[] nums;

  public TreeNode sortedArrayToBST(int[] nums) {
    this.nums = nums;

    return sortedArrayToBST(0, nums.length);
  }

  public TreeNode sortedArrayToBST(int left, int right) {

    if (left >= right)
      return null;

    int middle = (left + right) / 2;
    TreeNode n = new TreeNode(nums[middle]);

    if (left == right)
      return n;

    n.left = sortedArrayToBST(left, middle);
    n.right = sortedArrayToBST(middle + 1, right);

    return n;

  }
}
