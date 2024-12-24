class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {

        Map<Integer,Set<Integer>> map = new HashMap<>();

        for(int[] log : logs) {
            int id = log[0];
            int minute = log[1];
            if(map.containsKey(id)) {
                map.get(id).add(minute);
            }else {
                Set<Integer> set = new HashSet<>();
                set.add(minute);
                map.put(id,set);
            }
        }

        int[] res = new int[k];

        for(int key : map.keySet()) {
            int index = map.get(key).size();
            res[index-1]++;
        }

        return res;
    }
}