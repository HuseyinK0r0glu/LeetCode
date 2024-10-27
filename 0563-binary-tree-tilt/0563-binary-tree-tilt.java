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
    
    private int sum = 0;
    
    public int findTilt(TreeNode root) {
        
        dfs(root);
        
        return sum;
    }
    
    public int dfs(TreeNode node){
        
        if(node == null) return 0; 
        
        int val = node.val;
        
        int leftSum = dfs(node.left);
        int rightSum = dfs(node.right);
        
        node.val = Math.abs(leftSum - rightSum);
        sum += node.val;
        
        return leftSum + rightSum + val;
        
    }
    
}