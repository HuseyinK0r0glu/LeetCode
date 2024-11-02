class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        
        int[] res = new int[n];
        
        for(int i = 0;i<bookings.length;i++){
            
            int start = bookings[i][0];
            int end = bookings[i][1];
            int plus = bookings[i][2];
            
            while(start<=end){
                res[start-1] += plus;
                start++;
            }
            
        }
        
        return res;
        
    }
}