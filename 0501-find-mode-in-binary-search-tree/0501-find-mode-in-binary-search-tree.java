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
    public int[] findMode(TreeNode root) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        dfs(root,map);
        
        int maxFreq = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int key : map.keySet()){
            if(map.get(key) > maxFreq){
                maxFreq = map.get(key);
                list = new ArrayList<>(); 
                list.add(key);
            }else if(map.get(key) == maxFreq){
                list.add(key);
            }   
        }
        
        int[] res = new int[list.size()];
        
        for(int i = 0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
    
    public void dfs(TreeNode node,Map<Integer,Integer> map){
        
        if(node == null) return;
        
        map.put(node.val,map.getOrDefault(node.val,0)+1);
        dfs(node.left,map);
        dfs(node.right,map);
        
        
    }
    
}