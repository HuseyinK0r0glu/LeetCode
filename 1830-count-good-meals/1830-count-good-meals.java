class Solution {
    public int countPairs(int[] deliciousness) {
        int modulo = 1000000007;

        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0;i<deliciousness.length;i++){
            for(int j = 0;j<=21;j++){
                int twosPower = (int) Math.pow(2,j);
                count += map.getOrDefault(twosPower - deliciousness[i],0);
                count = count % modulo;
            }
            map.put(deliciousness[i],map.getOrDefault(deliciousness[i],0)+1);
        }

        return count % modulo;
    }
}