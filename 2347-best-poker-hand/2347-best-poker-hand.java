class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        
        boolean same = true;
        char val = suits[0];
        
        for(char c: suits){
            if(c != val){
                same = false;
                break;
            }
        }
        
        if(same) return "Flush";
        
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int rank : ranks){
            if(map.containsKey(rank)) map.put(rank,map.get(rank) + 1);
            else map.put(rank,1);
        }
        
        for(int key : map.keySet()){
            if(map.get(key) >= 3) return "Three of a Kind";
        }
        
        for(int key : map.keySet()){
            if(map.get(key) == 2) return "Pair";
        }
        
        return "High Card";
        
    }
}