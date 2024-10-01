class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int[] helper = new int[nums1.length];
        
        for(int i = 0;i<m;i++){
            helper[i] = nums1[i];
        }
        
        int left = 0;
        int right = 0;
        int current = 0;
        
        while(left < m && right < n){
            
            if(helper[left] <= nums2[right]){
                nums1[current++] = helper[left++];
            }else{
                nums1[current++] = nums2[right++];
            }
        }
        
        while(left < m){
            nums1[current++] = helper[left++];
        }
        
        while(right < n){
            nums1[current++] = nums2[right++];
        }
        
    }
}