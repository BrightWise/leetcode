package MaximumDepthOfBinaryTree;

/**
 * Created by brightwise on 17/8/9.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

public class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
