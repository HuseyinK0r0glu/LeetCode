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
    public boolean isCompleteTree(TreeNode root) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        boolean foundNull = false;
        
        while(!q.isEmpty()){
            
            TreeNode node = q.poll();    
                
            if(node == null){
                foundNull = true;
            }else {
                if(foundNull){
                    return false;
                }
                q.offer(node.left);
                q.offer(node.right);
            }
            
        }
        
        return true;
        
    }
}