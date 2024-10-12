class Solution {
    public int minGroups(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b) ->{
            if(a[0] == b[0]) return a[1] - b[1];
            else return a[0] - b[0];    
        });
        
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int i = 0;i<intervals.length;i++){
            
            if(!heap.isEmpty() && heap.peek()<intervals[i][0]) 
                heap.remove();
            
            heap.add(intervals[i][1]);
        }
        
        return heap.size();
    }
}