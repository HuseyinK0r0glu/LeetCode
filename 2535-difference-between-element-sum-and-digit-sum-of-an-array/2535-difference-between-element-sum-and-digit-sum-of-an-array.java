class Solution {
    public int differenceOfSum(int[] nums) {
        
        int elementSum = 0;
        int digitSum = 0;
        
        for(int i : nums){
            elementSum += i;
            digitSum += calculateDigits(i);
        }
        
        return Math.abs(elementSum - digitSum);
    }
    
    public int calculateDigits(int x){
        
        int result = 0;
        
        while(x >= 10){
            
            result += x % 10;
            x /= 10;
            
        }
        
        return result + x;
    }
}