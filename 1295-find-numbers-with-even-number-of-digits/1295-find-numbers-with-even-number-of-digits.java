class Solution {
    public int findNumbers(int[] nums) {
        
        int result = 0;
        
        for(int num : nums){
            if(findDigits(num) % 2 == 0){
                result++;
            }
        }
        
        return result;
        
    }
    
    public int findDigits(int num){
        
        int digit = 0;
        
        while(num>0){
            
            num /= 10;
            digit++;
            
        }
        
        return digit;
    }
}