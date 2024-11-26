class Solution {
    public static int nthUglyNumber(int n) {

        Set<Long> set = new HashSet<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();

        set.add(1L);
        pq.add(1L);
        int count = 0;

        long min = 0;

        while(count < n){
            min = pq.poll();
            count++;

            if(!set.contains(min * 2)){
                set.add(min * 2);
                pq.add(min * 2);
            }
            if(!set.contains(min * 3)){
                set.add(min * 3);
                pq.add(min * 3);
            }
            if(!set.contains(min * 5)){
                set.add(min * 5);
                pq.add(min * 5);
            }
        }

        return (int) min;
    }
}