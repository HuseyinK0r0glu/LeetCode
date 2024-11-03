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
    public int widthOfBinaryTree(TreeNode root) {

        if(root == null) return 0;
        
        Queue<Pair<TreeNode,Integer>> q = new LinkedList<>();
        q.offer(new Pair<>(root,1));
        
        int maxWidth = 0;
        
        while(!q.isEmpty()){
            
            int n = q.size();    
            
            int firstPos = 0;
            int lastPos = 0;
            int min = q.peek().getValue();
            
            for(int i = 0;i<n;i++){
                
                Pair<TreeNode,Integer> current = q.poll();
                
                TreeNode node = current.getKey();
                int value = current.getValue();
                int pos = value - min;
                
                if(i == 0) firstPos = pos;
                if(i == n-1) lastPos = pos;
                
                if(node.left != null) q.offer(new Pair<>(node.left,value * 2));
                if(node.right != null) q.offer(new Pair<>(node.right,value * 2 +1));
            }
            
            maxWidth = Math.max(maxWidth,lastPos - firstPos + 1);
            
        }
        
        return maxWidth;
        
    }
}