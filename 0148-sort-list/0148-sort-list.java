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
    public ListNode sortList(ListNode head) {
        
        List<Integer> list = new ArrayList<>();
        
        if(head == null) return head;
        
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        
        ListNode node = new ListNode(0);
        ListNode res = node;
        
        Collections.sort(list);
        
        for(int i = 0;i<list.size();i++){
            ListNode temp = new ListNode(list.get(i));
            node.next = temp;
            node = node.next;
        }
        
        return res.next;
        
    }
}