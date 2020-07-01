package leetcode;
import java.util.Arrays;
public class MaximumBinaryTree {

	public static void main(String[] args) {
		new MaximumBinaryTree().constructMaximumBinaryTree(new int[] {3,2,1,6,0,5});
	}
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) { val = x; }
	}

	public TreeNode constructMaximumBinaryTree(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			max = Math.max(max, nums[i]);
		}
		int index = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] == max) {
				index = j;
				break;
			}
		}
		TreeNode treeNode = new TreeNode(max);
		treeNode.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums, 0, index));
		treeNode.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums, index + 1, nums.length));
		return treeNode;
	}
}
