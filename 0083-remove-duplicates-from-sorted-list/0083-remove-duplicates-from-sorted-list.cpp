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
    ListNode* deleteDuplicates(ListNode* head) {
        
        ListNode* res;
        res = head;
        
        while(head != nullptr){
            
            if(head->next != nullptr){
                ListNode* nextNode = head->next;
                if(head->val == nextNode->val){
                    head->next = nextNode->next;
                    continue;
                }
            }
            
            head = head->next;
            
        }
        
        return res;
    }
};