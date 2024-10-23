class Solution {
    public int distributeCandies(int[] candyType) {
        
        Set<Integer> set = new HashSet<>();
        
        int max = 0;
        int selected = 0;
        
        for(int i = candyType.length-1;i>=0;i--){
            if(!set.contains(candyType[i])){
                max++;
                selected++;
            }
            
            set.add(candyType[i]);
            
            if(selected == candyType.length/2) return max;
            
        }
        
        return max;
        
    }
}