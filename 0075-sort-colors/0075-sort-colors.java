class Solution {
    public void sortColors(int[] nums) {
        
        for (int i = 0;i<nums.length;i++){
            int min = i;
            for(int j = i;j<nums.length;j++){
                if(nums[j] <=nums[min]){
                    min = j;
                }
            }
            
            exchange(nums,i,min);
        }
        
    }
    
    public void exchange(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}