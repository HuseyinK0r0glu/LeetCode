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
    public int amountOfTime(TreeNode root, int start) {
        
        if(root.left == null && root.right == null) return 0;
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        // build adjacency list
        buildList(root,null,map);
        
        Set<Integer> visited = new HashSet<>();
        
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited.add(start);
        
        int minute = 0;
        
        while(!q.isEmpty()){
            
            int n = q.size();
            
            for(int i = 0;i<n;i++){
                
                int current = q.poll();
                
                List<Integer> tempList = map.get(current);
                
                for(int j = 0;j<tempList.size();j++){
                    
                    if(!visited.contains(tempList.get(j))){
                        visited.add(tempList.get(j));
                        q.offer(tempList.get(j));
                    }
                    
                }
            }
            
            minute++;
        }
        
        return minute-1;
        
    }
    
    public void buildList(TreeNode node,TreeNode parent,Map<Integer,List<Integer>> map){
        
        if(node == null) return;
        
        if(!map.containsKey(node.val)){
            map.put(node.val,new ArrayList<>());
        }
        
        if(parent != null){
            map.get(parent.val).add(node.val);
            map.get(node.val).add(parent.val);
        }
        
        buildList(node.left,node,map);
        buildList(node.right,node,map);
    }
    
}