/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        
        Queue<Node> q = new LinkedList<>();
        
        if(root == null) return root;
        
        q.offer(root);
        
        while(!q.isEmpty()){
            
            int n = q.size();
            Node prev = null;
            
            for(int i = 0;i<n;i++){
                Node node = q.poll();
                
                if(prev != null){
                    prev.next = node;
                }
                
                prev = node;
                
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
                
            }
            
            prev.next = null;
            
        }
        
        return root;
        
    }
}