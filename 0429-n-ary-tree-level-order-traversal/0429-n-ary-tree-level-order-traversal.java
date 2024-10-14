/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        List<List<Integer>> list = new ArrayList<>();
        
        if(root == null) return list;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            
            int n = q.size();
            List<Integer> current = new ArrayList<>();
            
            for(int i = 0;i<n;i++){
                Node node = q.poll();
                
                current.add(node.val);
                
                for(Node child : node.children){
                    if(child != null){
                        q.add(child);
                    }
                }
                
            }
            
            list.add(current);
            
        }
        
        return list;
        
    }
}