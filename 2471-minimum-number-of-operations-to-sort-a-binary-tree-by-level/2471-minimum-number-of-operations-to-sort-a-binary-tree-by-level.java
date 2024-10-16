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
    public int minimumOperations(TreeNode root) {
        
        int total = 0;
        
        if(root == null) return total;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        
        while(!q.isEmpty()){
            
            int n = q.size();
            
            List<Integer> list = new ArrayList<>();
            
            for(int i=0;i<n;i++){
                TreeNode node = q.poll();
                
                list.add(node.val);
                
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
                
            }
            
            int[] array = new int[list.size()];
            
            for(int i = 0;i<list.size();i++){
                array[i] = list.get(i);
            }
            
            total += selectionSort(array);
            
        }
        
        return total;
        
    }
    
    public int selectionSort(int[] array){
        
        int change = 0;
        
        for(int i = 0;i<array.length;i++){
            
            int minIndex = i; 
                
            for(int j = i+1;j<array.length;j++){
                if(array[j] < array[minIndex]){
                    minIndex = j;
                }
            }
            
            if(minIndex != i){
                
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
                
                change++;
            }
            
            
        }
        
        return change;
    }
    
}