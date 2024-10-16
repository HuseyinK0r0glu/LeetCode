class Solution {
    public String addBinary(String a, String b) {
        
        int i = a.length()-1;
        int j = b.length()-1;
        
        StringBuilder sb = new StringBuilder();
        
        int len = Math.min(a.length(),b.length());
        int rem = 0;
        
        while(i>=0 || j>=0){
            int sum = rem;
            
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';
            
            sb.append(sum % 2);
            rem = sum / 2;
        }
        
        if(rem != 0){
            sb.append(rem);
        }
        
        return sb.reverse().toString();
        
    }
}