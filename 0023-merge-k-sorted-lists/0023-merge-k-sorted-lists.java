/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        /*
        // brute force
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0;i<lists.length;i++){
            while(lists[i] != null){
                result.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        
        Collections.sort(result);
        
        ListNode res = new ListNode(0);
        ListNode current = res; 
        
        for(int i = 0;i<result.size();i++){
            current.next = new ListNode(result.get(i));
            current = current.next;
        }
        
        return res.next;
        */
        
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> a.val - b.val);
        
        ListNode res = new ListNode(0);
        ListNode current = res;
        
        for(ListNode node : lists){
            if(node != null) pq.add(node);
        }
        
        while(!pq.isEmpty()){
            
            ListNode smallestNode = pq.poll();
            
            current.next = smallestNode;
            current = current.next;
            
            if(smallestNode.next != null) pq.add(smallestNode.next);
            
        }
        
        return res.next;
        
    }
}