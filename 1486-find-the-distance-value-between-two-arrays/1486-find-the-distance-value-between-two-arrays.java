class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int count = 0;
        
        for(int i = 0; i < arr1.length; i++){
            boolean less = false;
            for(int j = 0; j < arr2.length; j++){
                if(Math.abs(arr1[i] - arr2[j]) <= d){
                    less = true;
                    break;
                }
            }
            if(!less){
                count++;
            }
        }

        return count;
        
    }
}