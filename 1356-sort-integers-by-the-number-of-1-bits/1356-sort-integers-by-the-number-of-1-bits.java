class Solution {
    public int[] sortByBits(int[] arr) {

        // int[0] for oneCount int[1] number of values in tha arr
        Map<Integer,int[]> map = new HashMap<>();

        for(int num : arr) {
            int curr = num;
            int oneCount = 0;
            while(curr != 0) {
                if((curr & 1) == 1) oneCount++;
                curr = curr >> 1;
            }
            if(map.containsKey(num)) {
                map.get(num)[1]++;
            }else {
                map.put(num,new int[]{oneCount,1});
            }
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> {
            if(map.get(a)[0] == map.get(b)[0]) {
                return a - b;
            }
            return map.get(a)[0] - map.get(b)[0];
        });

        for(int key : map.keySet()) {
            int temp = map.get(key)[1];
            for(int i = 0;i<temp;i++) {
                pq.add(key);
            }
        }

        int[] res = new int[arr.length];
        int index = 0;

        while(!pq.isEmpty()) {
            res[index++] = pq.poll();
        }
        return res;
    }
}