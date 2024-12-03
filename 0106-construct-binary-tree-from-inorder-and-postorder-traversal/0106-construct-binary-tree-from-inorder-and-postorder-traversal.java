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
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return build(inorder,postorder,map,0,inorder.length-1,postorder.length-1);
    }

    public TreeNode build(int[] inorder, int[] postorder,Map<Integer,Integer> map,int left,int right,int index) {

        TreeNode root = new TreeNode(postorder[index]);
        int mid = map.get(postorder[index]);

        if(right > mid){
            root.right = build(inorder,postorder,map,mid + 1,right,index - 1);
        }

        if(left < mid){
            root.left = build(inorder,postorder,map,left,mid-1,index + mid - right - 1);
        }

        return root;
    }
}