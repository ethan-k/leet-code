package leetcode;

import java.util.PriorityQueue;

public class LongestUniValuePath {

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) { val = x; }
	}


	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(5);
		TreeNode n2 = new TreeNode(4);
		TreeNode n3 = new TreeNode(5);
		TreeNode n4 = new TreeNode(1);
		TreeNode n5 = new TreeNode(1);
		TreeNode n6 = new TreeNode(5);
		n1.left = n2;
		n1.right = n3;
		n2.left = n4;
		n2.right = n5;
		n3.right = n6;
		LongestUniValuePath longestUniValuePath = new LongestUniValuePath();
		System.out.println(longestUniValuePath.longestUnivaluePath(n1));
	}
	public int longestUnivaluePath(TreeNode root) {
		PriorityQueue<Integer> pq = new PriorityQueue<>((x, y) -> y - x);
		return longestUnivaluePath(root, pq);
	}



	public int longestUnivaluePath(TreeNode root, PriorityQueue<Integer> queue) {

		if (root == null) {
			return 0;
		}
		int leftCount = 0;
		if (root.left != null) {
			if (root.val == root.left.val)
				leftCount++;
			leftCount = leftCount + longestUnivaluePath(root.left, queue);
		}
		int rightCount = 0;
		if (root.right != null) {
			if (root.val == root.right.val)
				rightCount++;
			rightCount = rightCount + longestUnivaluePath(root.right, queue);
		}
		return Math.max(leftCount, rightCount);
	}

}
