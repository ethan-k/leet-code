package leetcode;

public class SameTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) { val = x; }
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) {
			return true;
		} else if (p == null && q != null) {
			return false;
		} else if (p != null && q == null) {
			return false;
		}
		if (p.val != q.val) {
			return false;
		}

		boolean left = isSameTree(p.left, q.left);
		boolean right = isSameTree(p.right, q.right);

		return left && right;
	}
}
