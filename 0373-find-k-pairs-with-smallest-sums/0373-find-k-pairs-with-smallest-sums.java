class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> ((a[0] + a[1]) - (b[0] + b[1])));
        
        
        for(int i = 0;i<Math.min(nums1.length,k);i++){
            pq.add(new int[]{nums1[i],nums2[0],0});
        }
        
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i = 0;i<k;i++){
            List<Integer> temp = new ArrayList<>();
            int[] arr = pq.poll();
            temp.add(arr[0]);
            temp.add(arr[1]);
            int index = arr[2];
            list.add(temp);
            
            if(index + 1< nums2.length){
                 pq.add(new int[]{arr[0],nums2[index+1],index+1});
            }
            
        }
        
        return list;
        
    }
}