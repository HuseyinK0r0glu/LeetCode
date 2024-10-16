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
    public boolean isUnivalTree(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int val = root.val;
        
        while(!q.isEmpty()){
            
            int n = q.size();
            
            for(int i = 0;i<n;i++){
                TreeNode node = q.poll();
                
                if(node.left != null){
                    if(node.left.val != val) return false;
                    q.offer(node.left);
                }
                
                if(node.right != null){
                    if(node.right.val != val) return false;
                    q.offer(node.right);
                }
                
            }
            
        }
        
        return true;
        
    }
}