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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> resultList = new ArrayList<>();
        
        if(root == null) return resultList;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int n = q.size();
            for(int i = 0;i<n;i++){
                TreeNode node = q.remove();
                list.add(node.val);
                
                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            
            resultList.add(list);
        }
        
        return resultList;
        
        
    }
}