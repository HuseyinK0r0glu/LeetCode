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
    public ListNode deleteMiddle(ListNode head) {
        
        ListNode res = new ListNode(0,head);
        
        ListNode delayed = head;
        
        if(head != null && head.next != null){
            head = head.next;
        }else {
            return null;
        }
        
        while(head.next != null && head.next.next != null){
            head = head.next.next;
            delayed = delayed.next;
        }
        
        delayed.next = delayed.next.next;
        
        return res.next;
        
    }
}