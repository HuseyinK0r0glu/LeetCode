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
    public ListNode removeElements(ListNode head, int val) {
        
        ListNode res = new ListNode(0);
        ListNode curr = res;
        res.next = head;
        
        while(curr != null && curr.next != null){
            
            if(curr.next.val == val){
                ListNode next2 = curr.next.next;
                curr.next = next2;
            }else {
                curr = curr.next;
            }
        }
        
        return res.next;
        
    }
}