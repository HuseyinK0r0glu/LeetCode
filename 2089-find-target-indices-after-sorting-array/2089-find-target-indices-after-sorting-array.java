class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        int N = nums.length;
        
        List<Integer> result = new ArrayList();

        for(int i=0;i<N;i++){
            
            int min = i;
            
            for(int j=i;j<N;j++){
                
                if(nums[j]<nums[min]){
                    min = j;
                }
                
            }
            
            exchange(nums,i,min);
            
        }
        
        for(int i = 0;i<N;i++){
            if(nums[i] == target){
                result.add(i);
            }
        }
        
        return result;
        
    }
    
    public void exchange(int[] nums,int i,int j){
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }
}