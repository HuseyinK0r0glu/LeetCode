class Solution {
    public int fib(int n) {
        
        if(n == 0) return 0;
        if(n == 1) return 1;
        
        int first = 0;
        int second = 1;
        
        int res = 0;
        
        for(int i = 1;i<n;i++){
            
            res = first + second;
            
            first = second;
            second = res;
            
        }
    
        return res;
        
        /*
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }
        return fib(n-1) + fib(n-2);
        */
    }

}