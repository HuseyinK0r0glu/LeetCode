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
    public int findSecondMinimumValue(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        
        dfs(root,list);
        
        int[] array = new int[list.size()];
        
        for(int i = 0;i<list.size();i++){
            array[i] = list.get(i);
        }
        
        Arrays.sort(array);
    
        int min = array[0];
        
        for(int num : array){
            if(num > min){
                return num;
            }
        }
        
        return -1;
        
    }
    
    public void dfs(TreeNode node,List<Integer> list){
        if(node == null) return;
        
        dfs(node.left,list);
        list.add(node.val);
        dfs(node.right,list);
        
    }
}