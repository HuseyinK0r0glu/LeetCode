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
    public TreeNode increasingBST(TreeNode root) {
     
        TreeNode res = new TreeNode(0);
        TreeNode curr = res;
        
        List<Integer> list = new ArrayList<>();
        
        dfs(root,list);

        for(int i : list){
            curr.right = new TreeNode(i);
            curr = curr.right;
        }
        
        return res.right;
    }
    
    public void dfs(TreeNode node, List<Integer> list){
        
        if(node == null) return;
        
        dfs(node.left,list);
        
        list.add(node.val);
        
        dfs(node.right,list);
        
    }
}