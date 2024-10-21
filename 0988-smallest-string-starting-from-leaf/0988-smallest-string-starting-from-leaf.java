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
    public String smallestFromLeaf(TreeNode root) {
        
        List<String> list = new ArrayList<>();
        
        dfs(root,list,"");

        for (int i = 0; i < list.size(); i++) {
            list.set(i, new StringBuilder(list.get(i)).reverse().toString());
        }
        
        Collections.sort(list);
        
        return list.get(0);
        
    }
    
    public void dfs(TreeNode node,List<String> list,String s){
        
        if(node == null) return; 
        
        char currentChar = (char) (node.val + 'a');
        s += currentChar;
        
        if(node.left == null && node.right == null) list.add(s);
        
        dfs(node.left,list,s);
        dfs(node.right,list,s);
        
    }
    
}