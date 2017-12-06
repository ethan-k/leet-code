package leecode;

public class ConstructStringFromBinaryTree {



	  public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	  }
	public String tree2str(TreeNode t) {
		if (t == null) {
			return "";
		}

		String result = String.valueOf(t.val);
		if (t.left != null) {
			result += "(" + tree2str(t.left) + ")";
		} else if (t.left == null && t.right != null) {
			result += "()";
		}

		if (t.right != null) {
			result += "(" + tree2str(t.right) + ")";
		}

		return result;
	}
}
