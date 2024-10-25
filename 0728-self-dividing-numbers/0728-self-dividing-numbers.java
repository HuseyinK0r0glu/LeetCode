class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i = left;i<=right;i++){
            if(check(i)) list.add(i);
        }
        
        return list;
    }
    
    public boolean check(int i){
        
        String s = String.valueOf(i);
        
        for(int j = 0;j<s.length();j++){
            int digit = s.charAt(j) - '0';
            if (digit == 0 || i % digit != 0) {
                return false;
            }
        }
        
        return true;
    }
    
}