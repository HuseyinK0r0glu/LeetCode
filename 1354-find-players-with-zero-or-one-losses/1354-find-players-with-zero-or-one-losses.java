class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {

        Map<Integer,int[]> map = new HashMap<>();

        for(int[] match : matches) {
            int winner = match[0];
            int loser = match[1];

            if(map.containsKey(winner)) {
                int[] winnerStat = map.get(winner);
                winnerStat[0]++;
                map.put(winner,winnerStat);
            }else {
                int[] stat = new int[2];
                stat[0] = 1;
                map.put(winner, stat);
            }

            if(map.containsKey(loser)){
                int[] loserStat = map.get(loser);
                loserStat[1]++;
                map.put(loser,loserStat);
            }else {
                int[] stat = new int[2];
                stat[1] = 1;
                map.put(loser,stat);
            }
        }

        List<Integer> allWinners = new ArrayList<>();
        List<Integer> oneLosers = new ArrayList<>();

        for(int key : map.keySet()) {
            int[] stat = map.get(key);
            if(stat[1] == 0){
                allWinners.add(key);
            }

            if(stat[1] == 1){
                oneLosers.add(key);
            }

        }

        Collections.sort(allWinners);
        Collections.sort(oneLosers);
        List<List<Integer>> result = new ArrayList<>();
        result.add(allWinners);
        result.add(oneLosers);
        return result;
    }
}