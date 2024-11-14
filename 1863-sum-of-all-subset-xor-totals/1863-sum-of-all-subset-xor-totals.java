class Solution {
    private int total = 0;

    public int subsetXORSum(int[] nums) {

        backtrack(nums,new ArrayList<>(),0);

        return total;
    }

    public void backtrack(int[] nums,List<Integer> list ,int index){

        if(!list.isEmpty()){
            int sum = 0;
            for (Integer integer : list) {
                sum ^= integer;
            }
            total += sum;
        }

        for(int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            backtrack(nums,list,i+1);
            list.remove(list.size()-1);
        }
    }
}