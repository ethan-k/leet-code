package leetcode;

import java.util.LinkedList;

public class TwoSumIV {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) { val = x; }
	}

	public static void main(String[] args) {
//[5,3,6,2,4,4,7]
		TreeNode n1 = new TreeNode(5);
		TreeNode n2 = new TreeNode(3);
		TreeNode n3 = new TreeNode(6);
		TreeNode n4 = new TreeNode(2);
		TreeNode n5 = new TreeNode(4);
		TreeNode n6 = null;
		TreeNode n7 = new TreeNode(7);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.left = n6;
		n3.right = n7;

		new TwoSumIV().findTarget(n1, 9);


	}

	LinkedList<Integer> list = new LinkedList<>();

	public boolean findTarget(TreeNode root, int k) {
		inputTarget(root);
		if (list.size() <= 1) {
			return false;
		}
		for (int i = 0; i < list.size(); i++) {
			Integer tmp = list.poll();
			if (list.contains(k - tmp)) {
				return true;
			}
			list.addLast(tmp);
		}
		return false;
	}

	public void inputTarget(TreeNode root) {
		list.add(root.val);
		if (root.right != null) {
			inputTarget(root.right);
		}
		if (root.left != null) {
			inputTarget(root.left);
		}
	}
}
