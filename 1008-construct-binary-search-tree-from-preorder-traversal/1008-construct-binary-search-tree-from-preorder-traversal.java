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
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode tree = new TreeNode(preorder[0]);
        
        for(int i = 1;i<preorder.length;i++){
            insert(tree,preorder[i]);
        }
        
        return tree;
    }
    
    public TreeNode insert(TreeNode node , int value){
        
        if(node == null){
            return new TreeNode(value);
        }else if(node.val > value){
            node.left = insert(node.left,value);
        }else {
            node.right = insert(node.right,value);
        }
        
        return node;
    }
    
}