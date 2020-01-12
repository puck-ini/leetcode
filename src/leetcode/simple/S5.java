package leetcode.simple;


import leetcode.simple.datatype.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class S5 {
    public int maxDepth(TreeNode root) {
        //1.判断节点是否为空
        //2.递归
        if (root == null){
            return 0;
        }
        int maxLeftDepth = maxDepth(root.left);
        int maxRightDepth = maxDepth(root.right);
        return Math.max(maxLeftDepth,maxRightDepth) + 1;
    }
}
