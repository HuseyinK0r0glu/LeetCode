class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        String res = "";
        
        Map<Character,Integer> map = new HashMap<>();
        
        for(char c : licensePlate.toCharArray()){
            if(Character.isLetter(c)){
               map.put(Character.toLowerCase(c),map.getOrDefault(Character.toLowerCase(c),0) + 1);
            }
        }
        
        
        
        for(String word : words){
            
            Map<Character,Integer> temp = new HashMap<>();
            
            for(char c : word.toCharArray()){
                temp.put(Character.toLowerCase(c),temp.getOrDefault(Character.toLowerCase(c),0) + 1);
            }
        
            boolean covering = true;
        
            for(char key : map.keySet()){
                if(!temp.containsKey(key)){
                    covering = false;
                    break;
                } 
                if(map.get(key) > temp.get(key)){
                    covering = false;
                    break;
                } 
            }
            
            if(covering && (word.length() < res.length() || res.equals(""))){
                res = word;
            }
            
        }
        
        return res;
        
    }
}