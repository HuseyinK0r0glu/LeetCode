class Solution {
    public String finalString(String s) {
        String newString = "";
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'i'){
                newString = reverseString(newString);
            }else{
                newString = newString + s.charAt(i);
            }
        }
        
        return newString;
    }
    
    
    public String reverseString(String string){
        
        String newString = "";
        for(int i = string.length() - 1;i >= 0;i--){
            newString = newString + string.charAt(i);
        }
        
        return newString;
    }
}