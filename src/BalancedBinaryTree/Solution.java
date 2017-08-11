package BalancedBinaryTree;

/**
 * Created by brightwise on 17/8/12.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public boolean isBalanced(TreeNode root) {
        boolean[] result = new boolean[1];
        result[0] = true;
        getHeight(root, 1, result);
        return result[0];
    }

    public int getHeight(TreeNode node, int level, boolean[] result) {
        if(node == null)
            return level;
        int left = getHeight(node.left, level+1, result);
        if(!result[0])
            return level;
        int right = getHeight(node.right, level+1, result);
        if(!result[0])
            return level;
        if(Math.abs(left-right) > 1)
            result[0] = false;
        return Math.max(left, right);

    }
}