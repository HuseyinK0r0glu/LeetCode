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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        
        ListNode res = new ListNode(0);
        res.next = list1;
        ListNode firstPart = res;
        
        for(int i = 0;i<a;i++){
            firstPart = firstPart.next;
        }
        
        ListNode secondPart = firstPart;
            
        for(int i = 0;i<=b-a+1;i++){
            secondPart = secondPart.next;
        }
        
        firstPart.next = list2;
        
        ListNode temp = list2;
        
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = secondPart;
        
        return res.next;
    }
}