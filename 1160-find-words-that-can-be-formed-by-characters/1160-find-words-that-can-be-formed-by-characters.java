class Solution {
    public int countCharacters(String[] words, String chars) {
        
        Map<Character,Integer> map = new HashMap<>();
        
        for(char c : chars.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        
        int total = 0;
        
        for(String word : words){
            if(word.length() > chars.length()){
                continue;
            }else {
                Map<Character,Integer> temp = new HashMap<>();
                for(char c : word.toCharArray()){
                    temp.put(c,temp.getOrDefault(c,0)+1);
                }
                
                boolean formed = true;
                for(char key : temp.keySet()){
                    if(!map.containsKey(key) || map.get(key) < temp.get(key)){
                        formed = false;
                        break;
                    }
                }
                
                if(formed) total+=word.length();
            }
        }
        
        return total;
    }
}