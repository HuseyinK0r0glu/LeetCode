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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        
        return dfs(root1,root2);
        
    }
    
    public boolean dfs(TreeNode node1,TreeNode node2){
        
        if(node1 == null && node2 == null) return true;
        if(node1 == null || node2 == null) return false;
        
        if(node1.val != node2.val) return false;
        
        boolean flip = dfs(node1.left,node2.right) && dfs(node1.right,node2.left);
        
        boolean noFlip = dfs(node1.left,node2.left) && dfs(node1.right,node2.right);
        
        return flip || noFlip;
        
    }
    
}