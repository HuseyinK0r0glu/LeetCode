class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        
        int key = 0; 
        
        if(ruleKey.equals("color")){
            key = 1;
        }else if(ruleKey.equals("type")){
            key = 0;
        }else {
            key = 2;
        }
        
        
        int result = 0;
        
        for(int i = 0;i<items.size();i++){
            
            if(items.get(i).get(key).equals(ruleValue)){
                result++;
            } 
            
        }
        
        return result;
        
    }
}