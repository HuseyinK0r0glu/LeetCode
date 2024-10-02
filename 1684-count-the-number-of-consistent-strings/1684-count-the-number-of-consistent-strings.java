class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int consistent = 0;
        
        Set<Character> allowedSet = new HashSet<>();
        
        for(char c: allowed.toCharArray()){
            allowedSet.add(c);
        }
        
        for(String s :words){
            
            boolean isConsistent = true;
            
            for(char c : s.toCharArray()){
                
                if(!allowedSet.contains(c)){
                    isConsistent = false;
                    break;
                }
                
            }
            
            if(isConsistent){
                consistent++;
            }
        }
        
        return consistent;
        
    }
}