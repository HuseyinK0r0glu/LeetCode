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
    public int[] nextLargerNodes(ListNode head) {

        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        ListNode temp = head;

        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }

        int[] result = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {

            while(!stack.isEmpty() && list.get(stack.peek()) < list.get(i)) {
                int index = stack.pop();
                result[index] = list.get(i);
            }

            stack.push(i);
        }

        return result;
    }
}