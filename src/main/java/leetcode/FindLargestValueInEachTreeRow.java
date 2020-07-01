package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FindLargestValueInEachTreeRow {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) { val = x; }
	}



	public List<Integer> largestValues(TreeNode root) {
		List<Integer> list = new ArrayList<>();
		if (root == null) {
			return list;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {

			int max = queue.peek().val;
			for (TreeNode treeNode : queue) {
				max = Math.max(max, treeNode.val);
			}
			list.add(max);
			Queue<TreeNode> inside = new LinkedList<>();
			while(!queue.isEmpty()) {
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
		return list;
	}
}
