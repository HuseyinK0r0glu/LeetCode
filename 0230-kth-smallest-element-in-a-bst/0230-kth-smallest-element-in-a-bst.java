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
    int count = 0;
    public int kthSmallest(TreeNode root, int k) {
        int[] ans = new int[1];
        
        dfs(root,k,ans);
        
        return ans[0];
        
    }
    
    public void dfs(TreeNode node,int k ,int[] ans){
        
        if(node == null) return;
        
        dfs(node.left,k,ans);
        count++;
        if(count == k){
            ans[0] = node.val;
            return;
        }
        
        dfs(node.right,k,ans);
        
    }
}