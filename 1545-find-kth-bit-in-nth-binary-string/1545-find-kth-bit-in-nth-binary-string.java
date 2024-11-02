class Solution {
    public char findKthBit(int n, int k) {
        
        return helper(n,k);
        
        /*
        // brute force
        String s = "0";
    
        while(n>0){
            
            s = s + "1" + reverse(inverse(s));
            
            n--;
        }
        
        return s.charAt(k-1);
        */
    }
    
    public char helper(int n ,int k){
        
        if(n == 1) return '0';
        
        int length = (1 << n)-1;
        int mid = length/2 + 1;
        
        if(mid == k){
            return '1';
        }else if(k<mid){
            return helper(n-1,k);
        }else{
            int mirrorK = length - k + 1;
            char res = helper(n-1,mirrorK);
            return inverse(res);
        }
        
    }
    
    public char inverse(char bit){
        return bit == '0' ? '1' : '0';
    }
    
    
    /*
    // brute force 
    public String reverse(String s){
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        
        return sb.toString();
    }
    
    public String inverse(String s){
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == '0'){
                sb.append("1");
            }else {
                sb.append("0");
            }
        }
        
        return sb.toString();
        
    }
    */
    
}