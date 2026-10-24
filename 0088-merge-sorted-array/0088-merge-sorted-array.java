class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int index = m + n - 1;

        while(m-1>=0 && n-1>=0){
            if(nums1[m-1] > nums2[n-1]){
                nums1[index--] = nums1[(m--)-1];
            }else {
                nums1[index--] = nums2[(n--)-1];
            }
        }

        while(n-1>=0){
            nums1[index--] = nums2[(n--)-1];
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna