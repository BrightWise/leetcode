package SymmetricTree;

import java.util.LinkedList;
import java.util.Queue;

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

    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return compareNode(root.left, root.right);
    }

    public boolean compareNode(TreeNode lNode, TreeNode rNode) {
        if(lNode == null || rNode == null)
            return lNode == rNode;

        if(lNode.val != rNode.val)
            return false;
        else
            return compareNode(lNode.left, rNode.right) && compareNode(lNode.right, rNode.left);
    }

    public boolean isSymmetric2(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode t1 = q.poll();
            TreeNode t2 = q.poll();
            if (t1 == null && t2 == null) continue;
            if (t1 == null || t2 == null) return false;
            if (t1.val != t2.val) return false;
            q.add(t1.left);
            q.add(t2.right);
            q.add(t1.right);
            q.add(t2.left);
        }
        return true;
    }

}
