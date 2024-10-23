class Solution {
    public String customSortString(String order, String s) {
        
        Map<Character,Integer> map = new HashMap<>();
    
        for(int i = 0;i<order.length();i++){
            map.put(order.charAt(i),i);
        }    
        
        Character[] charArray = new Character[s.length()];
        
        for(int i = 0;i<s.length();i++){
            charArray[i] = s.charAt(i);
        }
        
        Arrays.sort(charArray,(a,b) -> {
            if(map.containsKey(a) && map.containsKey(b)) return map.get(a) - map.get(b);
            else if(map.containsKey(a)) return -1;
            else if(map.containsKey(b)) return 1;
            else return a - b;
         });
        
        
        StringBuilder sb = new StringBuilder();
        
        for(char c : charArray){
            sb.append(c);
        }
        
        return sb.toString();
        
    }
}