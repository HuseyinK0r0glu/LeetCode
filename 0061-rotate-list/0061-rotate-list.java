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
        public ListNode rotateRight(ListNode head, int k) {

            if(head == null || head.next == null || k == 0){
                return head;
            }

            ListNode current = head;
            List<Integer> list = new ArrayList<>();
            while (current != null) {
                list.add(current.val);
                current = current.next;
            }
            int[] array = list.stream().mapToInt(i -> i).toArray();
            k = k % array.length;
            if (k == 0) {
                return head;
            }
            reverse(array, 0, array.length - 1);
            reverse(array, 0, k-1);
            reverse(array, k, array.length - 1);
            current = head;
            for (int i = 0; i < array.length; i++) {
                current.val = array[i];
                current = current.next;
            }
            return head;
        }
        public void reverse(int[] nums, int s,int e) {
            while(s < e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }
    }