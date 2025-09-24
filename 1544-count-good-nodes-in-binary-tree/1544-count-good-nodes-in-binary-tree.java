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
int result = 0;

    public int goodNodes(TreeNode root) {

        dfs(root, root.val);
        return result;
    }

    public void dfs(TreeNode root, int max) {

        if (root == null) return;
        if(max <= root.val) {
            result++;
        }

        dfs(root.left, Math.max(max, root.val));
        dfs(root.right, Math.max(max, root.val));

    }


}