import java.util.*;

class FindSumPairs {

    int[] nums1;
    int[] nums2;

    Map<Integer, Integer> map1 = new HashMap<>();
    Map<Integer, Integer> map2 = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        this.nums1 = nums1;
        this.nums2 = nums2;
        for(int num1 : nums1){
            map1.put(num1, map1.getOrDefault(num1, 0) + 1);
        }
        for(int num2 : nums2){
            map2.put(num2, map2.getOrDefault(num2, 0) + 1);
        }
    }

    public void add(int index, int val) {
        int oldVal = nums2[index];
        nums2[index] += val;
        if(map2.get(oldVal) == 1){
            map2.remove(oldVal);
        }else {
            map2.put(oldVal, map2.get(oldVal) - 1);
        }
        map2.put(nums2[index], map2.getOrDefault(nums2[index], 0) + 1);
    }

    public int count(int tot) {

        int total = 0;

        for(int key : map1.keySet()){
            if(map2.containsKey(tot - key)){
                total += map1.get(key) * map2.get(tot - key);
            }
        }

        return total;
    }
}