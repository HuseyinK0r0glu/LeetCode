class Solution {
    public boolean isHappy(int n) {

        int copy = n;
        
        Set<Integer> set = new HashSet<>();
        
        while(true){
            n = digitSquare(n);
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            
            if(n == 1){
                return true;
            }
        }
    }
    
    public int digitSquare(int n){
        
        int sum = 0;
        
        while(n > 0){
            sum += Math.pow(n%10,2);
            n /= 10;
        }
        
        return sum;
    }
}