class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> list = new ArrayList<List<Integer>>();

        permutation(list,nums,0,nums.length-1);
        
        return list;
        
    }
    
    
    public void permutation(List<List<Integer>> list , int[] nums,int left,int right){
        
        if(left == right){
            List<Integer> ourList = new ArrayList<Integer>();
            for(int i = 0;i<nums.length;i++){
                ourList.add(nums[i]);
            }
            list.add(ourList);
        }else{
            for(int i = left;i<=right;i++){
                swap(nums,left,i);
                permutation(list,nums,left+1,right);
                swap(nums,left,i);
            }
        }
        
    }
    
    public void swap(int[] nums,int i ,int j){
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
    }
    
}