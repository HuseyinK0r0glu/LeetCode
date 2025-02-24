class Solution {
    public static boolean check(int[] nums) {

        int count = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1]) {
                count++;
                if(count > 1){
                    return false;
                }
            }
        }

        if(nums[nums.length-1] > nums[0]) {
            count++;
        }
        
        return count <= 1;

        /*
        for(int i = 0 ; i < nums.length ; i++){
            if(check(nums,i)){
                return true;
            }
        }

        return false;
        */
    }

    public static boolean check(int[] nums , int index){

        // the sorting must be started from index

        int[] tempArray = new int[nums.length];
        int tempIndex = 0;

        while(tempIndex < nums.length){
            tempArray[tempIndex] = nums[index % nums.length];
            tempIndex++;
            index++;
        }

        for(int i = 0;i<tempArray.length-1;i++){
            if(tempArray[i] > tempArray[i+1]){
                return false;
            }
        }
        return true;
    }
}