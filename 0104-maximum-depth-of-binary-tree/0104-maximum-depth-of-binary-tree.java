/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        return findMax(root);    
    }
    
    public int findMax(TreeNode node){
        if(node == null) return 0;
        
        int leftMax = findMax(node.left);
        int rightMax = findMax(node.right);
        
        return 1 + Math.max(leftMax,rightMax);
        
    }
}