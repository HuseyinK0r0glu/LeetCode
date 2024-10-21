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

    private int maxSum = Integer.MIN_VALUE;
    
    public int maxPathSum(TreeNode root) {
        
        dfs(root);
        
        return maxSum;
        
    }
    
    public int dfs(TreeNode node){
        
        if(node == null) return 0;
        
        int leftPath = Math.max(dfs(node.left),0);
        int rightPath = Math.max(dfs(node.right),0);
        
        int current = node.val + leftPath + rightPath;
    
        maxSum = Math.max(maxSum,current);
        
        return node.val + Math.max(leftPath,rightPath);
    }
    
    
}