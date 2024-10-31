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
    
    private int res = 0; 
    
    public int averageOfSubtree(TreeNode root) {
        
        dfs(root);
        
        return res;
    }
    
    public int[] dfs(TreeNode node){
        
        int[] temp = new int[2];
        
        if(node == null) return temp;
        
        int[] leftPart = dfs(node.left);
        int[] rightPart = dfs(node.right);
        
        int totalSum = leftPart[0] + rightPart[0] + node.val;
        int totalNode = leftPart[1] + rightPart[1] + 1;
        
        if( Math.floor(totalSum / totalNode) == node.val) res++;
        
        temp[0] = totalSum;
        temp[1] = totalNode;

        return temp;
    }
    
}