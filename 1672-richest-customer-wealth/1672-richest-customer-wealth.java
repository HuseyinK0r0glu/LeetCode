class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int[] peoples = new int[accounts.length];
        
        for(int i = 0;i<accounts.length;i++){
            int wealth = 0;
            for(int j = 0;j<accounts[0].length;j++){
                wealth+=accounts[i][j];
            }
            
            peoples[i] = wealth;
        }
        
        Arrays.sort(peoples);
        
        return peoples[peoples.length-1];
        
    }
}