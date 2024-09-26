class Solution {
    public int thirdMax(int[] nums) {
        
        int N = nums.length;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0;i<N;i++){
            set.add(nums[i]);
        }
        
        ArrayList<Integer> list = new ArrayList(set);
        
        Collections.sort(list,Collections.reverseOrder());
        
        if(list.size() < 3){
            return list.get(0);
        }
        return list.get(2);

    }
}