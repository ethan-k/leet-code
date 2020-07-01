package leetcode;

public class SumOfLeftLeaves {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public int sumOfLeftLeaves(TreeNode root) {
		return sumOfLeftLeaves(root, false);
	}

	public int sumOfLeftLeaves(TreeNode root, boolean isLeft) {
		if (root == null) {
			return 0;
		}
		int result = 0;
		result = sumOfLeftLeaves(root.left, true) + sumOfLeftLeaves(root.right, false);
		if (root.left == null && isLeft == true && root.right == null) {
			result += root.val;
		}
		return result;
	}
}
