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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode current = head;
        ListNode prev = null;
        ListNode next;
        int count = 0;

        ListNode temp = head;
        int numOfNodes = 0;
        while (temp != null && numOfNodes < k) {
            temp = temp.next;
            numOfNodes++;
        }
        
        if(numOfNodes == k) {
            while(current != null && count < k) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                count++;
            }

            if(head != null){
                head.next = reverseKGroup(current, k);
            }

            return prev;
        }
    
        return head;
        
    }

}