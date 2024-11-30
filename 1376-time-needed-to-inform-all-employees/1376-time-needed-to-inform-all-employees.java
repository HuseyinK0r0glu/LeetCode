class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

        Map<Integer,List<Integer>> map = new HashMap<>();

        for(int i = 0;i<manager.length;i++){
            int man = manager[i];
            if(map.containsKey(man)){
                map.get(man).add(i);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(man,list);
            }
        }

        int time = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(headID);

        while(!queue.isEmpty()){

            int head = queue.poll();
            time = Math.max(time,informTime[head]);
            List<Integer> list = map.get(head);

            if(list != null){
                for(int i = 0;i<list.size();i++){
                    queue.add(list.get(i));
                    informTime[list.get(i)] += informTime[head];
                }
            }
        }
        return time;
    }
}