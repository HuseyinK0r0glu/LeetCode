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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        
        List<Integer> list = new ArrayList<>();
        
        dfs(root1,list);
        dfs(root2,list);
        
        Collections.sort(list);
        
        return list;
    }
    
    public void dfs(TreeNode node,List<Integer> list){
        
        if(node == null) return;
        
        list.add(node.val);
        
        dfs(node.left,list);
        dfs(node.right,list);
    }
    
}