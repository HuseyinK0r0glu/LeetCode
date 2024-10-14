/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        Set<ListNode> set = new HashSet<>();
        
        
        while(head != null){
            
            if(set.contains(head)){
                return true;
            }
            
            set.add(head);
            
            if(head.next != null) head = head.next;
            else break;
        }
        
        return false;
        
    }
}