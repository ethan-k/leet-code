package leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class BinaryTreeLevelOrderTraversal {
  List<List<Integer>> ret = new ArrayList<>(); 
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null)
            return ret; 
         
        traverse(Arrays.asList(root));
        return ret;
    }
    
    
    void traverse(List<TreeNode> nodes) {
        
        if (nodes.isEmpty())
            return;
        
        List<Integer> currentLevel = new ArrayList<>();
        List<TreeNode> nextNodes = new ArrayList<>(); 
        
        for(TreeNode node: nodes) {
            currentLevel.add(node.val);   
            if (node.left != null)
                nextNodes.add(node.left);
            if (node.right != null)
                nextNodes.add(node.right);
        }
        
        ret.add(currentLevel);
        traverse(nextNodes);
        
    }
    
}