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
    public boolean findTarget(TreeNode root, int k) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        return dfs(root,k,map);
        
    }
    
    public boolean dfs(TreeNode node,int k,Map<Integer,Integer> map){
        
        if(node == null) return false;
        
        if(map.containsKey(k - node.val)){
            if(node.val == k - node.val && map.get(k-node.val) <= 1){
                return false;
            } 
                return true;
        }
        
        map.put(node.val,map.getOrDefault(node.val,0)+1);
        
        return dfs(node.left,k,map) || dfs(node.right,k,map);
    }
    
}