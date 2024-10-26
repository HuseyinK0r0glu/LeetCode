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
    public TreeNode pruneTree(TreeNode root) {
        
        boolean res = dfs(root);
        
        if(res) return root;
        else return null;
    }
    
    public boolean dfs(TreeNode node){
        
        if(node == null) return false;
        
        boolean leftPart = dfs(node.left);
        boolean rightPart = dfs(node.right);
        
        if(!leftPart) node.left = null;
        if(!rightPart) node.right = null;
        
        return node.val == 1 || leftPart || rightPart;
        
        
    }
    
}