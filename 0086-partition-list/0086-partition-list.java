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
    public ListNode partition(ListNode head, int x) {
        
        ListNode res = new ListNode(0);
        ListNode temp = res;
        
        ListNode bigger = new ListNode(0);
        ListNode biggerT = bigger;
        
        while(head != null){
            
            if(head.val < x){
                temp.next = head;
                temp = temp.next;
            }else {
                biggerT.next = head;
                biggerT = biggerT.next;
            }
            
            head = head.next;
        }
        
        biggerT.next = null;
        temp.next = bigger.next;
        return res.next;
    }
}