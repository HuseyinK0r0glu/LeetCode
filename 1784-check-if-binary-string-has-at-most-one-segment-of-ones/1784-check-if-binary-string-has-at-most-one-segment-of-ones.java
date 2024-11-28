class Solution {
    public boolean checkOnesSegment(String s) {
        
        String[] arr = s.split("0");
        
        int count = 0;
        
        for(String str : arr){
            if(!str.isEmpty()) count++;
            if(count > 1) return false;
        }
        return true;
    }
}