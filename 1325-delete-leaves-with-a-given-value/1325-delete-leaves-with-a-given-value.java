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
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        
        boolean res = dfs(root,target);
        
        if(res){
            return null;
        }
        
        return root;
        
    }
    
    public boolean dfs(TreeNode node,int target){
        
        if(node == null) return false;
        
        if(dfs(node.left,target)){
            node.left = null;
        }
        if(dfs(node.right,target)){
            node.right = null;
        }
        
        return node.left == null && node.right == null && node.val == target;
        
    }
}