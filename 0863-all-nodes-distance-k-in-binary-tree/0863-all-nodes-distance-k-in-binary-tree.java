/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        Map<TreeNode,TreeNode> map = new HashMap<>();
        dfs(root,map,null);
        List<Integer> res = new ArrayList<>();
        Set<TreeNode> visited = new HashSet<>();
        dfsK(target,k,res,map,visited);
        return res;
    }

    public void dfsK(TreeNode node,int k,List<Integer> list,Map<TreeNode,TreeNode> map,Set<TreeNode> visited){

        if(node == null || visited.contains(node)){
            return;
        }

        visited.add(node);

        if(k == 0){
            list.add(node.val);
            return;
        }
        dfsK(node.left,k-1,list,map,visited);
        dfsK(node.right,k-1,list,map,visited);
        dfsK(map.get(node),k-1,list,map,visited);
    }

    public void dfs(TreeNode node,Map<TreeNode,TreeNode> map ,TreeNode parent) {
        if(node == null) return;
        map.put(node,parent);
        dfs(node.left,map,node);
        dfs(node.right,map,node);
    }
}