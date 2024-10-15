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
    public ListNode swapPairs(ListNode head) {
        
        if(head == null || head.next == null) return head;
        
        ListNode res = new ListNode(0);
        res.next = head;
        
        ListNode current = res;
        
        while(current.next != null && current.next.next != null){

            ListNode first = current.next;
            ListNode second = current.next.next;
            
            first.next = second.next;
            current.next = second;
            second.next = first;
            
            
            current = first;
            
        }
        
        return res.next;
        
    }
}