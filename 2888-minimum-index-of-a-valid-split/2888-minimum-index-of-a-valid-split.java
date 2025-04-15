import java.util.*;

class Solution {
    public int minimumIndex(List<Integer> nums) {

        Map<Integer,Integer> map = new HashMap<>();
        int dominant = 0;

        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num) * 2 > nums.size()){
                dominant = num;
            }
        }

        int f1 = 0;

        for(int i = 0;i<nums.size();i++) {
            if(nums.get(i) == dominant) {
                f1++;
            }
            if(f1 * 2 > (i+1) && (map.get(dominant) - f1 ) * 2 > (nums.size() - i -1)) {
                return i;
            }
        }

        return -1;
    }
}