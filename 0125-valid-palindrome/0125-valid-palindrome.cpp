class Solution {
public:
    bool isPalindrome(string s) {
        
        std::string cleaned;
        
        for(char c : s){
            if(isalnum(c)) cleaned += tolower(c);
        }
        
        int count = 0; 
        
        std::stack<char> stack;
        
        for(char c : cleaned){
            stack.push(c);
        }
        
        for(int i = 0;i<cleaned.size();i++){
            
            if(stack.top() != cleaned[i]) return false;
            stack.pop();
        }
        
        return true;
    }
};