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
    
    private boolean balanced = true;
    
    public boolean isBalanced(TreeNode root) {

        dfs(root);
        
        return balanced;
        
    }
    
    public int dfs(TreeNode node){
        
        if(node == null) return 0;
        
        int rightSide = dfs(node.right);   
        int leftSide = dfs(node.left);
        
        if(Math.abs(rightSide - leftSide) > 1) balanced = false;
        
        return 1 + Math.max(rightSide,leftSide);
        
    }
    
}