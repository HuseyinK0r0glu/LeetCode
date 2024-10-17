class Solution {
    public int longestPalindrome(String s) {
        
        // hashmap to keep freq of chars in s
        Map<Character,Integer> freq = new HashMap<>();
        
        for(int i = 0;i<s.length();i++){
            if(freq.containsKey(s.charAt(i))){
                int f = freq.get(s.charAt(i));
                freq.put(s.charAt(i),f+1);
                continue;
            }
            
            freq.put(s.charAt(i),1);
        }
        
        int result = 0;
        boolean hasOdd = false;
        
        for(char c : freq.keySet()){
            if(freq.get(c) % 2 == 0){
                result += freq.get(c);
                continue;
            }
            
            if(freq.get(c) % 2 == 1){
                result += freq.get(c) - 1;
                hasOdd = true;
            }
            
        }
        
        if(hasOdd){
            result++;
        }
        
        return result;
        
    }
}