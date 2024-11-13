class Solution {
    public static int findLucky(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int max = Integer.MIN_VALUE;

        for(int key : map.keySet()){

            if(map.get(key) == key){
                max = Math.max(max, key);
            }

        }

        if(max == Integer.MIN_VALUE) return -1;

        return max;
    }
}