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
    public int deepestLeavesSum(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        int sum = 0;
        
        while(!q.isEmpty()){
            
            int n = q.size();
         
            int tempSum = 0;
            
            boolean lastNode = true;
            
            for(int i = 0;i<n;i++){
                
                TreeNode node = q.poll();
                
                tempSum += node.val;
                
                if(node.left != null){
                    q.offer(node.left);
                    lastNode = false;
                } 
                if(node.right != null){
                    q.offer(node.right);
                }
                
            }
            
            if(lastNode) sum = tempSum;
            
        }
        
        return sum;
    }
}