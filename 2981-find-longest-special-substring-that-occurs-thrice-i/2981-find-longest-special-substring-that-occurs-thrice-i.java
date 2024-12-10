class Solution {
    public int maximumLength(String s) {

        Map<String,Integer> map = new LinkedHashMap<>();
        int longest = -1;
        
        for(int i = 0;i<s.length();i++){
            char current = s.charAt(i);
            StringBuilder sb = new StringBuilder();
            for(int j = i;j<s.length();j++){
                if(current == s.charAt(j)){
                    sb.append(current);
                    String temp = sb.toString();
                    map.put(temp,map.getOrDefault(temp,0) + 1);
                    
                    if(map.get(temp) >= 3){
                        longest = Math.max(longest,temp.length());
                    }
                    
                }else{
                    break;
                }
            }
        }
        return longest;
    }
}