class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] greater = new int[nums1.length];
        
        for(int i = 0;i<nums1.length;i++){
            int max = -1;
            int value = nums1[i];
            boolean found = false;
            for(int j = 0;j<nums2.length;j++){
                if(found){
                    if(nums2[j] > value){
                        max = nums2[j];
                        break;
                    }
                }
                if(nums2[j] == value){
                    found = true;
                }
            }
            
            greater[i] = max;
        }
        
        return greater;
        
    }
}