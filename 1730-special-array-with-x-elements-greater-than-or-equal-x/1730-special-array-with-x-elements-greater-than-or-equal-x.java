import java.util.*;

class Solution {
    public int specialArray(int[] nums) {

        Arrays.sort(nums);
        int max = nums[nums.length - 1];

        int index = 0;

        while(index <= max) {

            int i = binarySearch(nums, index);

            // find a place for index in nums with normal loop
//            while (i < nums.length && nums[i] < index) {
//                i++;
//            }

            if(index == nums.length - i) {
                return index;
            }

            index++;
        }

        return -1;
    }

    public int binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return low;
    }

}