package leetcode.simple;


import leetcode.simple.datatype.TreeNode;

import java.util.LinkedList;

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
//        if (root == null){
//            return 0;
//        }
//        int maxLeftDepth = maxDepth(root.left);
//        int maxRightDepth = maxDepth(root.right);
//        return Math.max(maxLeftDepth,maxRightDepth) + 1;


        //迭代,BFS层次遍历思想。广度优先算法
        if (root == null){
            return 0;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int maxDepth = 0;
        while (!queue.isEmpty()){
            maxDepth++;
            int queueSize = queue.size();
            //将每一层的节点的子节点推入队列
            for (int i = 0; i < queueSize; i++){
                TreeNode node = queue.pollFirst();
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }

        }
        return maxDepth;


        //DFS前序遍历思想。深度优先

    }
}
