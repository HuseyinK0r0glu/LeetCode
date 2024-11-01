class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        // with two pointers
        int pos = 0;
        int neg = 0;
        
        int[] res = new int[nums.length];
        
        for(int i = 0;i<nums.length;i++){
            
            if(i % 2 == 0){
                while(nums[pos] < 0) pos++;
                res[i] = nums[pos++];
            }else{
                while(nums[neg] > 0) neg++;
                res[i] = nums[neg++];
            }
            
        }
        
        return res;
        
        /*
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        
        for(int num : nums){
            if(num > 0) pos.add(num);
            else neg.add(num);
        }
        
        int index = 0;
        
        for(int i = 0;i<pos.size();i++){
            nums[index++] = pos.get(i);
            nums[index++] = neg.get(i);
        }
        
        return nums;
        */
    }
}