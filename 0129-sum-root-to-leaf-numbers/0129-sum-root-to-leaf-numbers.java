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
    private int total = 0;
    
    public int sumNumbers(TreeNode root) {
        
        dfs(root,"");
        return total;
    }
    
    public void dfs(TreeNode node,String s){
        
        if(node == null) return;
        
        s += String.valueOf(node.val);
        if(node.left == null && node.right == null){
            total += Integer.parseInt(s);
        }
        
        dfs(node.left,s);
        dfs(node.right,s);
    }

}