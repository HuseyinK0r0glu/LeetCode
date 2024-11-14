class Solution {
    public static int timeRequiredToBuy(int[] tickets, int k) {

        Queue<List<Integer>> queue = new LinkedList<>();

        for(int i = 0; i < tickets.length; i++) {
            List<Integer> list = new ArrayList<>();
            list.add(i);
            list.add(tickets[i]);
            queue.add(list);
        }

        int time = 0;

        while(!queue.isEmpty()) {
            time++;
            List<Integer> list = queue.poll();
            int index = list.get(0);
            int value = list.get(1);
            value--;
            if(index == k && value == 0){
                return time;
            }
            if(value>0){
                List<Integer> temp = new ArrayList<>();
                temp.add(index);
                temp.add(value);
                queue.add(temp);
            }
        }

        return time;
    }
}