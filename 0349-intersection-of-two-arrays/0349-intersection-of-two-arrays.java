class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        
        HashSet<Integer> resultSet = new HashSet<>();
        
        for(int i : nums1){
            set1.add(i);
        }
        
        for(int j : nums2){
            set2.add(j);
        }
        
        for(int i : set1){
            for(int j : set2){
                if(i == j){
                    resultSet.add(i);
                }
            }
        }
        
        int[] resultArray = new int[resultSet.size()];
        
        int a = 0;
        for(int i : resultSet){
            resultArray[a] = i;
            a++;
        }
        
        return resultArray;
        
        
    }
}