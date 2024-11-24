class Solution {
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        List<Integer> list = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int num : nums1){
            if(!set.contains(num)){
                map.put(num,map.getOrDefault(num,0) + 1);
            }
            set.add(num);
        }

        set.clear();

        for(int num : nums2){
            if(!set.contains(num)){
                map.put(num,map.getOrDefault(num,0) + 1);
            }
            set.add(num);
        }

        set.clear();

        for(int num : nums3){
            if(!set.contains(num)){
                map.put(num,map.getOrDefault(num,0) + 1);
            }
            set.add(num);
        }

        for(int key : map.keySet()){
            if(map.get(key) >= 2){
                list.add(key);
            }
        }

        return list;
    }
}