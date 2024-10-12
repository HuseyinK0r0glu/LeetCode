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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        ListNode res = new ListNode(0,head);
        
        ListNode leftNode = res;
        
        for(int i = 1;i<left;i++){
            leftNode = leftNode.next;
        }
        
        ListNode current = leftNode.next;

        for(int i = 0;i<right-left;i++){
            ListNode rightNode = current.next;
            current.next = rightNode.next;
            rightNode.next = leftNode.next;
            leftNode.next = rightNode;
        }
        
        return res.next;
        
    }
}