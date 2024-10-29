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
    
    private ListNode res = null;
    
    public ListNode reverseList(ListNode head) {
        
        /*
        // with iteration
        ListNode prev = null;
        ListNode current = head; 
        ListNode next = null;
        
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        
        return prev;
        */
        
        reverse(head);
        
        return res;
    }
    
    
    public void reverse(ListNode node){
        
        // with recursion
        
        if(node == null || node.next == null){
            res = node;
            return;
        }
        
        reverse(node.next);
        
        node.next.next = node;
        node.next = null;
    }
}