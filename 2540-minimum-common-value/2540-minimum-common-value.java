class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (int num : nums1) {
            set1.add(num);
        }
        
        for (int num : nums2) {
            set2.add(num);
        }
        
        set1.retainAll(set2);
        
        if(set1.isEmpty()){
            return -1;
        }
        
        ArrayList<Integer> list = new ArrayList<>(set1);
        
        Collections.sort(list,Collections.reverseOrder());
        
        return list.get(list.size()-1);
        
    }
}