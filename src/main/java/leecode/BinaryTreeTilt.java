package leecode;

public class BinaryTreeTilt {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) { val = x; }
	}

	int sum = 0;

	public int findTilt(TreeNode root) {
		getSum(root);
		return sum;
	}

	public int getSum(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = 0;
		int right = 0;
		if (root.left != null) {
			left = root.left.val + getSum(root.left);
		}
		if (root.right != null) {
			right = root.right.val + getSum(root.right);
		}
		sum += Math.abs(left - right);
		return left + right;
	}
}
