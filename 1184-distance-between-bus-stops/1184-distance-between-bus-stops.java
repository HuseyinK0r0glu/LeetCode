class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        if(start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }

        int left = 0;
        int right = 0;

        for(int i = start; i < destination; i++) {
            left += distance[i];
        }

        for(int i = destination ; i != start ; i = (i+1) % distance.length) {
            right += distance[i];
        }

        return Math.min(left,right);
    }
}