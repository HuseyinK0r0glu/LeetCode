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

        if(root == null) return null;
        
        Queue<Node> q = new LinkedList<>();
        
        root.next = null;
        q.offer(root);
        
        while(!q.isEmpty()){
            int size = q.size();
            
            List<Node> list = new ArrayList<>();
            
            for(int i = 0;i<size;i++){
                Node node = q.poll();
                
                list.add(node);
                
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
                
            }
            
            for(int i = 0;i<list.size();i++){
                if(i == list.size() - 1){
                    list.get(i).next = null;
                }else {
                    list.get(i).next  = list.get(i+1);
                }
            }
            
        }
        
        return root;
    }
}