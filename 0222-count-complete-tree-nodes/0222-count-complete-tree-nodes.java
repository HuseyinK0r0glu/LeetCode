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
    private int countN = 0;
    public int countNodes(TreeNode root) {
        count(root);
        return countN;
        
    }
    
    public void count(TreeNode node){
        
        if(node == null) return;
        
        countN++;
        
        count(node.left);
        count(node.right);
        
    }
}