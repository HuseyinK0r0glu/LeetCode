class Solution {
    public String longestDiverseString(int a, int b, int c) {
        
        int currA = 0,currB = 0,currC = 0;
        int i = 0;
        int len = a + b  + c;
        
        StringBuilder sb = new StringBuilder();
        
        while(i<len){
            
            if(currA != 2 && a>= b && a>=c || a>0 && (currB == 2 || currC == 2)){
                sb.append('a');
                a--;
                currA++;
                currB = 0;
                currC = 0;
            }
            
            else if(currB != 2 && b>=a && b>=c || b>0 && (currA == 2 || currC == 2)){
                sb.append('b');
                b--;
                currB++;
                currA = 0;
                currC = 0;
            }
            
            else if(currC != 2 && c>=a && c>=b  || c>0 && (currA == 2 || currB == 2)){
                sb.append('c');
                c--;
                currC++;
                currA = 0;
                currB = 0;
            }
            
            i++;
            
        }
        
        return sb.toString();
        
    }
}