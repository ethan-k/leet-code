package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int ret = 0;
        while (!q.isEmpty()) {
            int nodeSize = q.size();
            ret = 0;

            for (int i = 0; i < nodeSize; i++) {
                TreeNode n = q.poll();
                ret = ret + n.val;

                if (n.left != null) {
                    q.add(n.left);
                }
                if (n.right != null) {
                    q.add(n.right);
                }
            }

        }

        return ret;
    }
}
