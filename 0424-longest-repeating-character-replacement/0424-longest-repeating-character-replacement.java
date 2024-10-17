class Solution {
    public int characterReplacement(String s, int k) {
        
        // char and its number
        Map<Character,Integer> map = new HashMap<>();
        
        int result = 0;
        int l = 0;
        // keep the number max frequency of a char 
        int maxF = 0;
        
        for(int r = 0;r<s.length();r++){
            map.put(s.charAt(r),1 + map.getOrDefault(s.charAt(r),0));
            maxF = Math.max(maxF,map.get(s.charAt(r)));
            
            while(r-l+1 - maxF > k){
                int val = map.get(s.charAt(l));
                map.put(s.charAt(l),val-1);
                l++;
            }
            
            result = Math.max(result,r-l+1);
            
        }
        
        return result;
        
    }
}