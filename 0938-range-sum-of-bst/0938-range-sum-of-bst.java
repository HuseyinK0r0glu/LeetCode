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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return dfs(root,low,high,0);
    }
    
    public int dfs(TreeNode node,int low,int high,int total){
        
        if(node == null) return 0;
        
        if(node.val >= low && node.val <= high) total += node.val;
        
        return total + dfs(node.left,low,high,0) + dfs(node.right,low,high,0);
        
    }
}