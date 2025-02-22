class Solution {
    public int countPrimeSetBits(int left, int right) {

        int primeNums = 0;
        Set<Integer> primeNumSet = Set.of(2, 3, 5, 7, 11, 13, 17, 19);

        for(int i = left; i <= right; i++) {
            
            int count = 0;
            int temp = i;
            
            while(temp != 0){
                if((temp & 1) == 1){
                    count++;
                }
                temp = temp >> 1; 
            }
            
            if(primeNumSet.contains(count)){
                primeNums++;
            }
        }
        
        return primeNums;
    }
}