class Solution {
    public int minFlips(int a, int b, int c) {
        
        int total = 0;
        
        while(c > 0 || b > 0 ||a > 0){
            int cbit = c & 1;
            int abit = a & 1;
            int bbit = b & 1;
            
            if(cbit != 0){
                if(abit == 0 && bbit == 0){
                    total++;
                }
            }else {
                total = total + abit + bbit;
            }
            
            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        
        return total;
        
    }
}