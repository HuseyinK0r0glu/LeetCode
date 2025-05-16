import java.util.*;

class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {

        Set<Integer> set = new HashSet<>();
        
        for(List<Integer> num : nums){
            int start = num.get(0);
            int end = num.get(1);
            for(int i = start; i <= end; i++){
                set.add(i);
            }
        }
        
        return set.size();
    }
}