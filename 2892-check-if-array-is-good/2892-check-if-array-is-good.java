class Solution {
    public boolean isGood(int[] nums) {

        int max = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : nums) {
            max = Math.max(max, num);
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        if(nums.length != max+1){
            return false;
        }

        for(int key : map.keySet()) {
            if(map.get(key) >= 2 && key != max){
                return false;
            }
        }

        return true;
    }
}