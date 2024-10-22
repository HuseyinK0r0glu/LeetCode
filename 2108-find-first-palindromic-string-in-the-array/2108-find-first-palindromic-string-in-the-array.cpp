class Solution {
public:
    string firstPalindrome(vector<string>& words) {
        
        for(int i = 0;i<words.size();i++){
            if(isPalindrome(words[i])) return words[i];
        }
        
        return "";
    }
    
private:
    bool isPalindrome(string &s){
        
        int left = 0;
        int right = s.size() -1;
        
        while(left < right){
            if(s[left] != s[right]) return false;
            
            left++;
            right--;
            
        }
        return true;
    }
};