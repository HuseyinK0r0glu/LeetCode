import java.util.*;

class Solution {
    public int[] maxKDistinct(int[] nums, int k) {

        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();

        int index = nums.length - 1;

        while(index >= 0 && set.size() < k) {
            if(set.contains(nums[index])) {
                index--;
                continue;
            }
            set.add(nums[index]);
            index--;
        }
        
        List<Integer> list = new ArrayList<>(set.stream().mapToInt(Integer::intValue).sorted().boxed().toList());
        Collections.sort(list);
        Collections.reverse(list);
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}