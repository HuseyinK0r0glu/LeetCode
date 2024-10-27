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
    public int getDecimalValue(ListNode head) {
     
        String s = "";
        
        while(head != null){
            s += String.valueOf(head.val);
            head = head.next;
        }
        
        return decimal(s);
    }
    
    public int decimal(String s){
        
        int pow = 0;
        
        int value = 0;
        
        for(int i = s.length() - 1;i>=0;i--){
            
            value += Integer.parseInt(String.valueOf(s.charAt(i))) * (int)Math.pow(2,pow++);
            
        }
        
        return value;
        
    }
    
}