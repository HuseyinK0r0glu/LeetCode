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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        
        dfs(root,result,currentPath,targetSum);
        
        return result;
        
    }
    
    public void dfs(TreeNode node ,List<List<Integer>> result,List<Integer> currentPath,int targetSum){
        
        if(node == null) return;
        
        currentPath.add(node.val);
        
        if(node.left == null && node.right == null && node.val == targetSum) {
            // to add the copy of currentPath
            result.add(new ArrayList<>(currentPath));
        }else {
            dfs(node.left,result,currentPath,targetSum - node.val);
            dfs(node.right,result,currentPath,targetSum - node.val);
        }
        
        currentPath.remove(currentPath.size() - 1);
        
    }
    
}