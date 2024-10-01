class Solution {
    public int[] sortArray(int[] nums) {
        
        // merge sort
        int[] helper = new int[nums.length];
        mergeSort(nums,helper,0,nums.length-1);
        return nums;
        
    }
    
    public void mergeSort(int[] nums,int[] helper,int low,int high){
        
        if(low < high){
            int middle = (low + high)/2;
            mergeSort(nums,helper,low,middle); // left part
            mergeSort(nums,helper,middle+1,high);
            merge(nums,helper,low,middle,high);
        }
        
    }
    
    public void merge(int[] nums,int[] helper,int low,int middle,int high){
        
        for(int i = low;i<=high;i++){
            helper[i] = nums[i];
        }
        
        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;
        
        while(helperLeft <= middle && helperRight <= high){
            
            if(helper[helperLeft] < helper[helperRight]){
                nums[current++] = helper[helperLeft++];
            }else {
                nums[current++] = helper[helperRight++];
            }
            
        }
        
        int rem = middle - helperLeft;
        for(int i = 0;i<=rem;i++){
            nums[current + i] = helper[helperLeft + i];
        }
        
    }
}