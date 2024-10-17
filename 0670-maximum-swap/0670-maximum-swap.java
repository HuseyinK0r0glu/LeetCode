class Solution {
    public int maximumSwap(int num) {
        
        char[] digits = Integer.toString(num).toCharArray();
        int n = digits.length;
        
        for(int i = 0;i<n;i++){
            
            boolean swapped = false;
            
            int maxDigit = i;
           
            for(int j = n-1;j>i;j--){
                
                if(digits[j] > digits[maxDigit]){
                    maxDigit = j;
                }
                
            }
        
            if(maxDigit != i){
                char temp = digits[i];
                digits[i] = digits[maxDigit];
                digits[maxDigit] = temp;
                swapped = true;
            }
            
            if(swapped) break;
            
        }
        
        return Integer.parseInt(new String(digits));
    }
}