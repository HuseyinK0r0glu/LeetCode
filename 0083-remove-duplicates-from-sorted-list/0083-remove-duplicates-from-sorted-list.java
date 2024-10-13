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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode res = new ListNode(0,head);
        ListNode current = res;
        
        while(head != null){
            
            if (head.next != null) {
                ListNode nextNode = head.next;
                if(head.val == nextNode.val){
                    head.next = nextNode.next;
                    continue;
                }
                
            }
            
            head = head.next;
        }
        
        return res.next;
    }
}