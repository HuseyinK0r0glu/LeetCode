class Solution {
    public int countDigits(int num) {
        
        int result = 0;
        int realNumber = num;
        
        while(num > 0){
            
            int lastNumber = num % 10;
            
            if(realNumber % lastNumber == 0){
                result++;
            }
            
            num = num / 10;
            
        }
        
        
        return result;
        
    }
}