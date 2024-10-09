class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        
        int answer1 = 0;
        int answer2 = 0;
        
        for(int i = 0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums2[j] == nums1[i]){
                    answer1++;
                    break;
                }
            }
            
        }
        
        for(int j=0;j<nums2.length;j++){
            for(int i = 0;i<nums1.length;i++){
                if(nums1[i] == nums2[j]){
                    answer2++;
                    break;
                }
            }
        }
        
        int[] result = new int[2];
        
        result[0] = answer1;
        result[1] = answer2;
        
        return result;
        
    }
}