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
    public ListNode mergeKLists(ListNode[] lists) {
        
        List<Integer> result = new ArrayList<>();
        
        for(int i = 0;i<lists.length;i++){
            while(lists[i] != null){
                result.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        
        Collections.sort(result);
        
        ListNode res = new ListNode(0);
        ListNode current = res; 
        
        for(int i = 0;i<result.size();i++){
            current.next = new ListNode(result.get(i));
            current = current.next;
        }
        
        return res.next;
        
    }
}