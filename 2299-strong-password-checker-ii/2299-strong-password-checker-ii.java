class Solution {
    public boolean strongPasswordCheckerII(String password) {
        
        boolean upper = false;
        boolean lower = false;
        boolean special = false;
        boolean digit = false;
        
        for(int i = 0;i<password.length();i++){
            
            if(i != password.length()-1 && password.charAt(i) == password.charAt(i+1)) return false; 
            
            else if(String.valueOf(password.charAt(i)).matches("[!@#$%^&*()\\-+]")) special = true;
            
            else if(Character.isDigit(password.charAt(i))) digit = true;
               
            else if(Character.isUpperCase(password.charAt(i))) upper = true;
                    
            else if(Character.isLowerCase(password.charAt(i))) lower = true;
        }    
                    
        return upper && lower && special && digit && password.length() >= 8;
        
    }
}