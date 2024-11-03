class Solution {
    public int[] sumZero(int n) {
        
        int[] arr = new int[n];
        
        if(n % 2 == 0){
            int index = 0;
            int val = 1;
            int neg = -1;
            while(index < n){            
                arr[index++] = val++;
                arr[index++] = neg--;
            }
        }else {
            arr[0] = 0;
            int index = 1;
            int val = 1;
            int neg = -1;
            while(index < n){
                arr[index++] = val++;
                arr[index++] = neg--;
            }
            
        }
        
        return arr;
    }
}