class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        // list holds value and the index
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>((a,b) -> b.get(0) - a.get(0));
        
        for(int i= 0;i<score.length;i++){
            pq.add(Arrays.asList(score[i],i));
        }
        
        String[] result = new String[score.length];
        
        int place = 1;
        
        while(!pq.isEmpty()){
            
            List<Integer> list = pq.poll();
            
            if(place == 1){
                result[list.get(1)] = "Gold Medal";
                place++;
                continue;
            }
            
            if(place == 2){
                result[list.get(1)] = "Silver Medal";
                place++;
                continue;
            }
            
            if(place == 3){
                result[list.get(1)] = "Bronze Medal";
                place++;
                continue;
            }
            
            result[list.get(1)] = String.valueOf(place++);
            
        }
        
        return result;
    }
}