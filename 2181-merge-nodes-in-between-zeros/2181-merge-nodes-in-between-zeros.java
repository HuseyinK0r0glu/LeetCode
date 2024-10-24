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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode res = new ListNode(0);
        ListNode curr = res;
        
        while(head != null){
            
            if(head.val == 0 && head.next != null){
                
                ListNode right = head.next;
                int sum = 0;
                
                while(right != null && right.val != 0){
                    sum += right.val;
                    right = right.next;
                }
                head = right;
                
                curr.next = new ListNode(sum);
                curr = curr.next;
                
            }else head = head.next;
        }
        
        return res.next;
        
    }
}