class Solution {
public:
    int fib(int n) {
        
        int first = 0;
        int second = 1;
        
        if(n == 0) return first;
        if(n == 1) return second;
        
        int res = 0;
        
        for(int i = 1;i<n;i++){
            
            res = first + second;
            first = second;
            second = res;
            
        }
        
        return res;
    }
};