package leetcode;

public class invertTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}

	public TreeNode invertTree(TreeNode root) {
		if (root == null) {
			return null;
		}
		TreeNode tmp = root.right;
		root.right = root.left;
		root.left = tmp;
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}
}
