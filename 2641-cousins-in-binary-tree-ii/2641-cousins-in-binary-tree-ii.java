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
    public TreeNode replaceValueInTree(TreeNode root) {
        
        if(root == null) return root;
        
        Queue<TreeNode> q = new LinkedList<>();
        root.val = 0;
        q.offer(root);
        
        while(!q.isEmpty()){
            
            int n = q.size();
            
            int sum = 0;
            
            for(int i = 0;i<n;i++){
                
                TreeNode node = q.poll();
                
                if(node.left != null) sum += node.left.val;
                if(node.right != null) sum += node.right.val;

                q.offer(node);
            }
            
            for(int i = 0;i<n;i++){
                
                TreeNode tempNode = q.poll();
                int tempSum = sum;
             
                if(tempNode.left != null){
                    tempSum -= tempNode.left.val;
                    q.offer(tempNode.left);
                }
                
                if(tempNode.right != null){
                    tempSum -= tempNode.right.val;
                    q.offer(tempNode.right);
                }
                
                if(tempNode.left != null){
                    tempNode.left.val = tempSum;
                }
                
                if(tempNode.right != null){
                    tempNode.right.val = tempSum;
                }
            }

        }
        
        return root;
        
    }
}