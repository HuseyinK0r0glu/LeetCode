/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    int pairSum(ListNode* head) {
        
        ListNode* tempNode = head;
        
        std::stack<int> stack;
        
        int n = 0;
        
        while(head != nullptr){
            stack.push(head->val);
            head = head->next;
            n++;
        }
        
        int maxSum = 0;
        
        for(int i = 0; i < n / 2; ++i){
            int twinValue = stack.top();
            stack.pop();

            // Calculate twin sum and update maxSum
            int twinSum = twinValue + tempNode->val;
            if (twinSum > maxSum) {
                maxSum = twinSum;
            }

            // Move to the next node
            tempNode = tempNode->next;
        }
        
        return maxSum;
        
    }
};