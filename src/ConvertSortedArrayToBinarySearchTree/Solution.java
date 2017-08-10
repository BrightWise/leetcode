package ConvertSortedArrayToBinarySearchTree;

/**
 * Created by brightwise on 17/8/11.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0)
            return null;

        return generateTree(nums, 0 ,nums.length-1);
    }

    public TreeNode generateTree(int[] nums, int start, int end) {
        if(start > end)
            return null;
        int middle = (start + end)/2;

        TreeNode node = new TreeNode(nums[middle]);
        node.left = generateTree(nums, start, middle-1);
        node.right = generateTree(nums, middle+1, end);
        return node;
    }
}