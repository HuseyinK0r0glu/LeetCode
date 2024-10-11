class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        
        int[] targetTime = times[targetFriend];
        
        Arrays.sort(times, (a, b) -> Integer.compare(a[0], b[0]));
        
        int[] chairTime = new int[times.length];
     
        for(int i = 0;i<times.length;i++){
            for(int c = 0;c<chairTime.length;c++){
                if(chairTime[c] <= times[i][0]){
                    chairTime[c] = times[i][1];
                    if(Arrays.equals(times[i],targetTime)) return c;
                    break;
                }
            }
        }
        
        return 0;
    }
}