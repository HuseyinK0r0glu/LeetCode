class Solution {
    public int stoneGameVI(int[] aliceValues, int[] bobValues) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        
        for(int i = 0;i<aliceValues.length;i++){
            pq.add(new int[]{aliceValues[i] + bobValues[i],i});
        }
        
        int alice = 0;
        int bob = 0;

        boolean aliceTurn = true;
        
        while(!pq.isEmpty()){
            
            int[] temp = pq.poll();
            
            if(aliceTurn){
                alice += aliceValues[temp[1]];
            }else {
                bob += bobValues[temp[1]];
            }
            
            aliceTurn = !aliceTurn;
            
        }
        
        if(alice == bob) return 0;
        
        return alice>bob ? 1 : -1;
        
    }
}