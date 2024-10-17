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
    public boolean isCousins(TreeNode root, int x, int y) {
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            
            int n = q.size();
            Set<Integer> set = new HashSet<>();
            
            for(int i = 0;i<n;i++){
                
                TreeNode node = q.poll();
            
                set.add(node.val);
                
                if(node.left != null){
                    q.offer(node.left);
                }
                
                if(node.right != null){
                    q.offer(node.right);
                }
                
                if(node.left != null && node.right != null){
                    if(node.left.val == x && node.right.val == y || node.left.val == y && node.right.val == x) return false;
                }
                
            }
            
            if(set.contains(x) && set.contains(y)) return true;
            if(set.contains(y)) return false;
            if(set.contains(x)) return false;
            
        }
        
        return false;
        
    }
}