class Solution {
    public boolean checkIfExist(int[] arr) {
        
        int N = arr.length;
        
        for(int i=0;i<N;i++){
            
            for(int j=0;j<N;j++){
                
                if(arr[i] == 2*arr[j] && i != j){
                    return true;
                }
            }
            
        }
        
        return false;
    }
}