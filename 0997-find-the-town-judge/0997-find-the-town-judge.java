class Solution {
    public static int findJudge(int n, int[][] trust) {

        if (trust.length == 0) {
            return n == 1 ? 1 : -1;
        }
        
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0;i<trust.length;i++){
            map.put(trust[i][1],map.getOrDefault(trust[i][1],0)+1);
            set.add(trust[i][0]);
        }

        for(int key : map.keySet()){
            if(map.get(key) == n-1 && !set.contains(key)){
                return key;
            }
        }
        return -1;
    }
}