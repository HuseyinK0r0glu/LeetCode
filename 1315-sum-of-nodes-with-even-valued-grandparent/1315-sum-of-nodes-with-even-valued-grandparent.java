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
    public int sumEvenGrandparent(TreeNode root) {
        
        if(root == null) return 0;
        
        TreeNode[] info = {root,null,null};
        
        Queue<TreeNode[]> q = new LinkedList<>();
        q.offer(info);
        
        int sum = 0;
        
        while(!q.isEmpty()){
            
            TreeNode[] tempInfo = q.poll();
            
            TreeNode curr = tempInfo[0];
            TreeNode parent = tempInfo[1];
            TreeNode gParent = tempInfo[2];
            
            if(gParent != null && gParent.val % 2 == 0){
                sum += curr.val;
            }
            
            if(curr.left != null) q.offer(new TreeNode[]{curr.left,curr,parent});
            if(curr.right != null) q.offer(new TreeNode[]{curr.right,curr,parent});
            
        }
        
        return sum;
    }
}