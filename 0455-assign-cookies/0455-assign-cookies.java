class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);
        
        int content = 0;
        int cookieCount = 0;
        
        for(int i=g.length-1;i>=0;i--){
            for(int j=s.length-1-cookieCount;j>=0;j--){
                if(g[i]<=s[j]){
                    cookieCount++;
                    content++;
                    break;
                }
            }
            
            /*
            for(int j = cookieCount;j<s.length;j++){
                if(g[i]<=s[j]){
                    gaveCookie = true;
                    content++;
                    cookieCount++;
                    break;
                }
            }
            
            if(!gaveCookie){
                return content;
            }
            */
        }
        
        
        return content;
    }
}