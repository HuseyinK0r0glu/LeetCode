class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        s1 = sort(s1);
        
        for(int i = 0;i<=s2.length() - s1.length();i++){
            if(s1.equals(sort(s2.substring(i,i+s1.length())))){
                return true;
            }
        }
        
        return false;
        /*
        // brute force
        if(s1.length() > s2.length()){
            return false;
        }
        
        return permute(s1,s2,0,s1.length()-1);
        */
    }
    
    
    public String sort(String s){
        
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    
    /*
    // brute force
    public boolean permute(String s1,String s2,int left,int right){
        if(left == right){
            if(s2.contains(s1)){
                return true;
            }
        }else {
            for(int i = left;i<=right;i++){
                s1 = swap(s1,left,i);
                if(permute(s1,s2,left+1,right)){
                    return true;
                }
                s1 = swap(s1,left,i);
            }
        }
        return false;
    }
    
    
    public String swap(String s1,int i,int j){
        
        char[] charArray = s1.toCharArray();
        
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        
        return String.valueOf(charArray);
        
    } 
    */
}