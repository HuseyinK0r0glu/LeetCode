class Solution {
    public int sumOddLengthSubarrays(int[] arr) {

        int total = 0;

        for(int i = 1; i < arr.length; i++){
            arr[i] += arr[i - 1];
        }

        for(int i = arr.length - 1; i >= 0; i--){
            int j = i;
            while(j >= 0){
                if((i-j+1) % 2 == 1){
                    if(j == 0){
                        total += arr[i];
                    }else {
                        total += arr[i] - arr[j-1];
                    }
                }
                j--;
            }
        }
        return total;
    }
}