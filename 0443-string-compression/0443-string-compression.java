class Solution {
    public int compress(char[] chars) {
        
        if(chars.length == 1) return 1;
        
        int index = 0;
        
        for(int i = 0;i<chars.length;i++){
            
            char cur = chars[i];
            int j = i+1;
            int temp = 1;
            
            while(j<chars.length && chars[j] == cur){
                temp++;
                j++;
            }
            
            chars[index++] = cur;

            if(temp > 1){
                for(char c : Integer.toString(temp).toCharArray()){
                    chars[index++] = c;
                }
            }
            
            i = j-1;
        }
        
        return index;
    }
}