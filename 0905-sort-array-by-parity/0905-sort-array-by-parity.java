class Solution {
    public int[] sortArrayByParity(int[] nums) {

        List<Integer> evenList = new ArrayList<>();
        List<Integer> oddList = new ArrayList<>();
        
        for(int num : nums){
            if(num % 2 == 0){
                evenList.add(num);
            }else {
                oddList.add(num);
            }
        }

        int[] res = new int[nums.length];
        int index = 0;
        
        for(int even : evenList){
            res[index++] = even;
        }
        
        for(int odd : oddList){
            res[index++] = odd;
        }
        return res;
    }
}