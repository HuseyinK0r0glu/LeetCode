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
    public List<String> binaryTreePaths(TreeNode root) {
        
        List<String> list = new ArrayList<>();

        dfs(root,list,"");
        
        return list;
        
    }
    

    public void dfs(TreeNode node, List<String> list,String s){
        
        if(node == null) return; 
        
        s += node.val;
        if(node.left == null && node.right == null) list.add(s); 
        
        dfs(node.left,list,s + "->");
        dfs(node.right,list,s + "->");
    }

}