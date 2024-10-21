class Solution {
    public int maxUniqueSplit(String s) {
        
        Set<String> set = new HashSet<>();
        
        return backtrack(s,set,0);
        
    }
    
    public int backtrack(String s,Set<String> set,int start){
        
        if(start == s.length()) return 0;
        
        int maxSplit = 0;
        
        for(int end=start+1;end<=s.length();end++){
            String subString = s.substring(start,end);
            if(!set.contains(subString)){
                set.add(subString);
                maxSplit = Math.max(maxSplit,1+backtrack(s,set,end));
                set.remove(subString);
            }
            
        }
        
        return maxSplit;
        
    }
    
}