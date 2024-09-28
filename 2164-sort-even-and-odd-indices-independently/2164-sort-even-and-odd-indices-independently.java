class Solution {
    public int[] sortEvenOdd(int[] nums) {
        
        int N = nums.length;
        
        for(int i = 0;i<N;i++){
            
            if(i % 2 == 0){
                
                int maxForEven = i;
                
                for(int j = i + 2 ;j<N;j = j + 2){
                    
                    if(nums[j] < nums[maxForEven]){
                        maxForEven = j;
                    }
                    
                }
                
                
                int temp = nums[i];
                nums[i] = nums[maxForEven];
                nums[maxForEven] = temp;
                
            }else {
                
                int maxForOdd = i;
                
                for(int j = i + 2 ;j<N;j = j + 2){
                        if(nums[j] > nums[maxForOdd]){
                            maxForOdd = j;
                    }
                }
                
                int temp = nums[i];
                nums[i] = nums[maxForOdd];
                nums[maxForOdd] = temp;
                
            }
            
            
        }
        
        return nums;
        
    }
}