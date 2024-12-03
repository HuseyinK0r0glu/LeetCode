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
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        // map for the keep the index of the values in inorder
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i<inorder.length;i++) {
            map.put(inorder[i],i);
        }

        return build(preorder,inorder,map,0,inorder.length-1,0);
    }

    public TreeNode build(int[] preorder, int[] inorder,Map<Integer,Integer> map,int left,int right,int index) {

        TreeNode root = new TreeNode(preorder[index]);
        int mid = map.get(preorder[index]);

        if(left < mid){
            root.left = build(preorder,inorder,map,left,mid-1,index+1);
        }

        if(right > mid){
            root.right = build(preorder,inorder,map,mid+1,right,index + mid - left + 1);
        }
        return root;
    }
}