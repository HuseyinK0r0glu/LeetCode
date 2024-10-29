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

private: ListNode* res  =nullptr;

public:
    ListNode* reverseList(ListNode* head) {
        
        reverse(head);
        
        return res;
        /*
        ListNode* prev = nullptr;
        ListNode* current = head;
        ListNode* next = nullptr;
        
        while(current != nullptr){
            next = current->next;
            current->next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
        */
    }
    
public:
    void reverse(ListNode* head){
        
        if(head == nullptr || head->next == nullptr){
            res = head;
            return;
        }
        
        reverse(head->next);
        
        head->next->next = head;
        head->next = nullptr;
        
    }
};