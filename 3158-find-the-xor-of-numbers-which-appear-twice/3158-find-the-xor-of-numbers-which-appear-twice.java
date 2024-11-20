class Solution {
    public static int duplicateNumbersXOR(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();

        int xor = 0;

        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0) + 1);
            if(map.get(num) == 2) xor ^= num;
        }

        return xor;
    }
}