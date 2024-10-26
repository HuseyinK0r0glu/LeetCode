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
    
    public int sumRootToLeaf(TreeNode root) {
        
        List<String> list = new ArrayList<>();
        
        dfs(root,list,"");
        
        int sum = 0;
        
        for(String s : list){
            sum += Integer.parseInt(s,2);
        }
        
        return sum;
        
    }
    
    public void dfs(TreeNode node,List<String> list,String s){
        
        if(node == null) {
            return;
        }
        
        s += String.valueOf(node.val);
        
        if(node.left == null && node.right == null) list.add(s);
        else {
            dfs(node.left,list,s);
            dfs(node.right,list,s);
        }

    }
}