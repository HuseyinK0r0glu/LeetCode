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
    public int getMinimumDifference(TreeNode root) {
        
        List<Integer> list = new ArrayList<>();
        
        dfs(root,list);
        
        Collections.sort(list);
        
        int min = Integer.MAX_VALUE;
        
        for(int i = 0;i<list.size()-1;i++){
            min = Math.min(min,list.get(i+1)-list.get(i));
        }
        
        return min;
        
    }
    
    public void dfs(TreeNode node,List<Integer> list){
        
        if(node == null) return;

        list.add(node.val);
        
        dfs(node.left,list);
        dfs(node.right,list);
        
    }
    
}