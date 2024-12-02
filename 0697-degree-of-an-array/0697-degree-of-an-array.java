class Solution {
    public int findShortestSubArray(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        Map<Integer,Integer> freqeuncyMap = new HashMap<>();
        Map<Integer,Integer> firstOccurence = new HashMap<>();
        Map<Integer,Integer> lastOccurence = new HashMap<>();

        int maxFrequency = 0;

        for(int i = 0;i<nums.length;i++){
            int num = nums[i];
            freqeuncyMap.put(num,freqeuncyMap.getOrDefault(num,0)+1);
            maxFrequency = Math.max(maxFrequency,freqeuncyMap.get(num));

            if(!firstOccurence.containsKey(num)){
                firstOccurence.put(num,i);
            }
            lastOccurence.put(num,i);

        }

        int shortest = Integer.MAX_VALUE;

        for(int num : freqeuncyMap.keySet()){
            if(freqeuncyMap.get(num) == maxFrequency){
                shortest = Math.min(shortest,lastOccurence.get(num) - firstOccurence.get(num) + 1);
            }
        }

        return shortest;
    }
}