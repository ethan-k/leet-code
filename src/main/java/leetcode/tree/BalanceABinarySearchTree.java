package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class BalanceABinarySearchTree {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> inOrder = new ArrayList<>();
        inOrder(root, inOrder);
        return buildTree(0, inOrder.size()-1, inOrder);
    }

    TreeNode buildTree(int left, int right, List<Integer> inOrder) {

        if (left > right)
            return null;

        int middle = (left+right)/2;
        Integer val = inOrder.get(middle);

        TreeNode n = new TreeNode(val);
        n.left = buildTree(left, middle-1, inOrder);
        n.right = buildTree(middle+1, right, inOrder);

        return n;

    }

    void inOrder(TreeNode node, List<Integer> inOrder) {

        if (node == null)
            return;

        inOrder(node.left, inOrder);
        inOrder.add(node.val);
        inOrder(node.right, inOrder);
    }
}
