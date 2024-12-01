class Solution {
    public int winningPlayerCount(int n, int[][] pick) {

        Map<Integer,Map<Integer,Integer>> map = new HashMap<>();

        for(int i = 0;i<pick.length;i++){
            int player = pick[i][0];
            int ball = pick[i][1];
            if(!map.containsKey(player)){
                Map<Integer,Integer> temp = new HashMap<>();
                temp.put(ball,1);
                map.put(player,temp);
            }else {
                Map<Integer,Integer> temp = map.get(player);
                temp.put(ball,temp.getOrDefault(ball,0)+1);
                map.put(player,temp);
            }
        }

        int total = 0;

        for(int key : map.keySet()){
            for(int tempKey : map.get(key).keySet()){
                if(map.get(key).get(tempKey) > key){
                    total++;
                    break;
                }
            }
        }
        return total;
    }
}