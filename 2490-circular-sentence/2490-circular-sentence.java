class Solution {
    public boolean isCircularSentence(String sentence) {
        
        String[] arr = sentence.split(" ");
        
        for(int i = 0;i<arr.length;i++){
            
            if(i != arr.length -1){
                String s1 = arr[i];
                String s2 = arr[i+1];
            
                if(s1.charAt(s1.length()-1) != s2.charAt(0)) return false;
            }else {
                String s = arr[i];
                if(s.charAt(s.length() -1) != arr[0].charAt(0)) return false; 
            }
            
        }
        
        return true;
        
    }
}