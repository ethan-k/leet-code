package leetcode.tree;

import java.util.*;

public class  SumOfRootToLeafBinaryNumber {
    List<String> binaries = new ArrayList<>();
    public int sumRootToLeaf(TreeNode root) {
        traverse("", root);
        
        int total = 0;
        
        for(String binary: binaries) {
            total += Integer.parseInt(binary, 2);
        }
        
        return total;
    }
    
    void traverse(String cur, TreeNode n) {
        if (n == null) {
            return;
        }
        
        cur += String.valueOf(n.val);
        if (n.left == null && n.right == null) {
            binaries.add(cur);
        }
        
        traverse(cur, n.left);
        traverse(cur, n.right);
    }
}