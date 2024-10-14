class Solution {
    public int tribonacci(int n) {
        
        Map<Integer,Integer> map = new HashMap<>();
        return tribonacci(n,map);
    }
    
    public int tribonacci(int n ,Map<Integer,Integer> map){
        if(n == 0){
            return 0;
        }
        
        if(n == 1 || n == 2){
            return 1;
        }
        
        if(!map.containsKey(n)){
            map.put(n,tribonacci(n-1,map) + tribonacci(n-2,map) + tribonacci(n-3,map));
        }
        
        return map.get(n);
    }
}