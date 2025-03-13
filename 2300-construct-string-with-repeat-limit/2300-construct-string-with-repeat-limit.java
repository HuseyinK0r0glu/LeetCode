class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {

        PriorityQueue<Character> pq = new PriorityQueue<>(Collections.reverseOrder());
        Map<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            if(!map.containsKey(c)){
                pq.add(c);
            }
            map.put(c,map.getOrDefault(c,0)+1);
        }

        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){
            char c = pq.poll();
            int i = 0;
            while(map.get(c)>0 && i<repeatLimit){
                sb.append(c);
                map.put(c,map.get(c)-1);
                i++;
            }
            if(map.get(c) > 0 && !pq.isEmpty()){
                char second = pq.poll();
                sb.append(second);
                map.put(second,map.get(second)-1);
                if(map.get(second) > 0){
                    pq.add(second);
                }
                if(map.get(c) > 0){
                    pq.add(c);
                }
            }
        }
        return sb.toString();
    }
}