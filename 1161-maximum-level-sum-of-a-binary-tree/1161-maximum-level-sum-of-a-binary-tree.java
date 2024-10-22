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
    public int maxLevelSum(TreeNode root) {
        
        int level = 0;
        
        long maxSum = Integer.MIN_VALUE;
        int maxLevel = 1;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            
            int n = q.size();
            
            long sum = 0;
            
            for(int i = 0;i<n;i++){
                
                TreeNode node = q.poll();
                
                sum += node.val;
                
                if(node.right != null) q.offer(node.right);
                if(node.left != null) q.offer(node.left);
            }
            
            level++;
            
            if(sum > maxSum){
                maxSum = sum;
                maxLevel = level;
            }
        }
        
        return maxLevel;
        
    }
}