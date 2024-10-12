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
    public ListNode middleNode(ListNode head) {
        
        ListNode delayed = head;
        
        while(head != null && head.next != null && head.next.next != null){
            head = head.next.next;
            delayed = delayed.next;
        }
        
        if(head.next != null){
            delayed =delayed.next;
        }
        
        return delayed;
        
    }
}