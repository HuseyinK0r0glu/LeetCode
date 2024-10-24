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
    
    private int maxDepth = -1;
    private int leftValue = 0;
    
    public int findBottomLeftValue(TreeNode root) {
        
        /*
        // bfs
        if(root == null) return 0;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            
            int n = q.size();
            
            List<Integer> list = new ArrayList<>();
            
            for(int i = 0;i<n;i++){
                
                TreeNode node = q.poll();
                
                list.add(node.val);
                
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
                
            }
            
            if(q.size() == 0) {
                return list.get(0);
            }
            
        }
        
        return -1;
        */
        
        dfs(root,0);
        return leftValue;
        
    }
    
    public void dfs(TreeNode node,int depth){
        
        if(node == null) return;
        
        
        if(depth > maxDepth){
            maxDepth = depth;
            leftValue = node.val;
        }
        
        dfs(node.left,depth+1);
        dfs(node.right,depth+1);
        
    }
    
}