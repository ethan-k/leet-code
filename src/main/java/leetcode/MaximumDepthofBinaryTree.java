package leetcode;


public class MaximumDepthofBinaryTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) { val = x; }
	}

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return findMax(root, 0);
	}

	public int findMax(TreeNode root, int count) {
		if (root == null) {
			return count;
		}
		count++;
		return Math.max(findMax(root.left, count), findMax(root.right, count));
	}
}
