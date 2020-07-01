package leetcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KthSmallestElementInABST {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) { val = x; }
	}

	public int kthSmallest(TreeNode root, int k) {
		List<Integer> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			for (TreeNode treeNode : queue) {
				list.add(treeNode.val);
			}
			Queue<TreeNode> inside = new LinkedList<>();
			while (!queue.isEmpty()) {
				TreeNode treeNode = queue.poll();
				if (treeNode.left != null) {
					inside.add(treeNode.left);
				}
				if (treeNode.right != null) {
					inside.add(treeNode.right);
				}
			}
			queue = inside;
		}
		list.sort(Comparator.naturalOrder());
		return list.get(k - 1);
	}
}
