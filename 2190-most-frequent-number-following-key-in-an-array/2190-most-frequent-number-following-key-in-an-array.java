class Solution {
    public int mostFrequent(int[] nums, int key) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 1;i<nums.length;i++){
            if(nums[i-1] == key){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
        }

        int max = 0;
        int res = -1;

        for(int mapKey : map.keySet()){
            if(map.get(mapKey) > max){
                max = map.get(mapKey);
                res = mapKey;
            }
        }
        return res;
    }
}