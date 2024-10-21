class Solution {
    private int total = 0;
    
    public int countArrangement(int n) {
        
        int[] array = new int[n];
        
        backtrack(array,1);
        
        return total;
    }
    
    public void backtrack(int[] array,int num){
        
        if(num > array.length) {
            total++;
            return;
        }
        
        for(int i = 0;i<array.length;i++){
            if(array[i] == 0){
                array[i] = num;
                if(check(array)) backtrack(array,num+1);
                array[i] = 0;
            }
        }
    } 
    
    
    public boolean check(int[] array){
        
        for(int i = 0;i < array.length;i++){
            if(array[i] != 0){
                if(array[i] % (i+1) != 0 && (i+1) % array[i] != 0) return false; 
            }   
        }
        
        return true;
        
    }
}