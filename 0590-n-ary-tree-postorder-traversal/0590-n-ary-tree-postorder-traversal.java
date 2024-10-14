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
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        
        List<Integer> list = new ArrayList<>();
        
        dfs(root,list);
        
        return list;
        
    }
    
    public void dfs(Node node,List<Integer> list){
        
        if(node == null) return;
        
        List<Node> children = node.children;
        
        int n = children.size();
        
        for(int i = 0;i<n;i++){
            dfs(children.get(i),list);
        }
        
        list.add(node.val);
        
    }
    
}