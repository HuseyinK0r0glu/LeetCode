class Solution {
    public String compressedString(String word) {
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i<word.length();i++){
            
            char cur = word.charAt(i);
            int j = i+1;
            int total = 1;
            
            while(j<word.length() && word.charAt(j) == cur && total < 9){
                total++;
                j++;
            }
            
            sb.append(total);
            sb.append(cur);
            i = j-1;
        }
        
        return sb.toString();
        
    }
}