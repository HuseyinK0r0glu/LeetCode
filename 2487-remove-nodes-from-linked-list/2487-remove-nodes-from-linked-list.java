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
    public ListNode removeNodes(ListNode head) {
        
        Deque<ListNode> stack = new ArrayDeque<>();
        
        while(head != null){
            
            while(!stack.isEmpty() && stack.peek().val < head.val){
                stack.pop();
            }
            
            stack.push(head);
            
            head = head.next;
        }
        
        ListNode res = null;
        
        while(!stack.isEmpty()){
            ListNode node = stack.pop();
            node.next = res;
            res = node;
        }
        
        return res;
        
        /*
        List<Integer> list = new ArrayList<>();
        
        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        
        ListNode res = new ListNode(0);
        ListNode curr = res;
        
        int max = Integer.MIN_VALUE;
        
        List<Integer> maxList = new ArrayList<>();
        
        for(int i = list.size()-1;i>=0;i--){
            
            max = Math.max(max,list.get(i));
            
            if(list.get(i) >= max){
                maxList.add(list.get(i));
            }
        }
        
        Collections.reverse(maxList);
        
        for(int i = 0;i<maxList.size();i++){
            curr.next = new ListNode(maxList.get(i));
            curr = curr.next;
        }
        
        return res.next;
        */
    }
}