class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int[] indices = new int[2];
        
        for(int i=0;i<numbers.length;i++){
            int secondTarget = target - numbers[i];
            // binary search 
            int secondValue = binarySearch(numbers,secondTarget);
            if(secondValue != -1 && secondValue != i){
                indices[0] = i + 1;
                indices[1] = secondValue + 1;
                Arrays.sort(indices);
                return indices;
            }
        }
        return indices;
        
    }
    
    
    public int binarySearch(int[] numbers,int target){
        
        int left = 0;
        int right = numbers.length-1;
        
        while(left <= right){
            
            int mid = left + (right - left)/2;
            
            if(numbers[mid] == target){
                return mid;
            }else if(numbers[mid] > target){
                right = mid -1;
            }else {
                left = mid + 1;
            }
            
        }
        
        return -1;
        
    }
}