class Solution {
    public int matrixSum(int[][] nums) {
        
        int score = 0;
        
        // sort every row 
        for(int i = 0;i<nums.length;i++){
            Arrays.sort(nums[i]);
        }
        
        for(int j = 0;j<nums[0].length;j++){
            int max = 0;
            for(int i = 0;i<nums.length;i++){
                if(nums[i][j] > max){
                    max = nums[i][j];
                }
            }
            score += max;
        }
        
        return score;
    }
}