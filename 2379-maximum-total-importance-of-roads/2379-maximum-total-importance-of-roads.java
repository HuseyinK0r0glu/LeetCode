import java.util.*;

class Solution {
    public long maximumImportance(int n, int[][] roads) {

        Map<Integer,Integer> map = new HashMap<>();

        for(int[] road : roads) {
            map.put(road[0],map.getOrDefault(road[0],0) + 1);
            map.put(road[1],map.getOrDefault(road[1],0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));

        long result = 0;

        for(int i = 0;i<n;i++){
            if(map.containsKey(i)){
                pq.add(i);
            }
        }

        while(!pq.isEmpty()){
            int index = pq.poll();
            if(map.containsKey(index)){
                result += (long) map.get(index) * n--;
            }
        }

        return result;
    }
}