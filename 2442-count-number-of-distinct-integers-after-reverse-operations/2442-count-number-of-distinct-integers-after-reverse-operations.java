class Solution {
    public int countDistinctIntegers(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
            reverse(nums[i],set);
        }
        
        return set.size();
        
    }
    
    public void reverse(int num,Set<Integer> set){
        
        String s = String.valueOf(num);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = s.length()-1;i>=0;i--){
            
            if(i == s.length()-1 && s.charAt(i) == '0'){
                continue;
            }
            
            sb.append(s.charAt(i));
            
        }
        
        set.add(Integer.parseInt(sb.toString()));
        
    }
    
}