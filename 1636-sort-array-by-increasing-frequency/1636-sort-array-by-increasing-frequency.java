class Solution {
    public static int[] frequencySort(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        Integer[] numsArray = new Integer[nums.length];

        for(int i = 0;i < nums.length;i++){
            numsArray[i] = nums[i];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        Arrays.sort(numsArray,(a,b) -> {
           int freq = Integer.compare(map.get(a),map.get(b));
           if(freq == 0){
               return Integer.compare(b,a);
           }
           return freq;
        });

        return Arrays.stream(numsArray).mapToInt(Integer::intValue).toArray();
    }
}