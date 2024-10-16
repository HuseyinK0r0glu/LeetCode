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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
    
        if(root == null) return result;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int isEven = 0;
        
        while(!q.isEmpty()){
            int n = q.size();
            
            List<Integer> list = new ArrayList<>();
            
            for(int i = 0;i<n;i++){
                TreeNode node = q.poll();
                list.add(node.val);
                if(node.right != null) q.offer(node.right);
                if(node.left != null) q.offer(node.left);
            }
            
            if(isEven % 2 != 0){
                result.add(list);
            }else {
                Collections.reverse(list);
                result.add(list);
            }
            isEven++;
             
            
        }
        
        return result;
    }
}