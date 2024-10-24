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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        
        ListNode res = new ListNode(0);
        res.next = head;
        
        while(head != null && head.next != null){
            
            int val = gcd(head.val,head.next.val);
            
            ListNode temp = head.next;
            head.next = new ListNode(val);
            head.next.next = temp;
            
            head = head.next.next;
        }
        
        return res.next;
        
    }
    
    public int gcd(int a,int b){
        if(b > a) return gcd(b,a);
        if(b == 0) return a;
        else return gcd(b,a%b);
        
    }
}