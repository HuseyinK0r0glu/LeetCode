class Solution {
    public int removeElement(int[] nums, int val) {

        int index = 0;
        for (int num : nums){
            if (num != val) nums[index++] = num;
        }
        return index;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna