package leecode.tree;

import java.util.PriorityQueue;

public class BinarySearchTreeIterator {

    PriorityQueue<Integer> queue;

    public BinarySearchTreeIterator(TreeNode root) {
        queue = new PriorityQueue<>();
        init(root);
    }

    void init(TreeNode node) {
        if (node == null)
            return;
        queue.offer(node.val);
        init(node.left);
        init(node.right);

    }

    /**
     * @return the next smallest number
     */
    public int next() {
        return queue.poll();
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return !queue.isEmpty();
    }
}
