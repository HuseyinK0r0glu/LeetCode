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
    public List<Double> averageOfLevels(TreeNode root) {
        
        List<Double> averageList = new ArrayList<>();
        
        if(root == null) return averageList;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            
            double average = 0;
            int divisor = 0;
            int n = q.size();
            
            for(int i =0;i<n;i++){
                
                TreeNode node = q.remove();
                average += node.val;
                divisor++;
                
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
                
            }
            
            if(divisor != 0){
                averageList.add(average / divisor);
            }
        }
        
        return averageList;
        
    }
}