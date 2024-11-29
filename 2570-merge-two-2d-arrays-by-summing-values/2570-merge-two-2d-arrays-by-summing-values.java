class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int[] row : nums1) {
            map.put(row[0], row[1]);
        }

        for (int[] row : nums2) {
            if (map.containsKey(row[0])) {
                map.put(row[0], map.get(row[0]) + row[1]);
            } else {
                map.put(row[0], row[1]);
            }
        }

        Set<Integer> sortedSet = new TreeSet<>(map.keySet());
        int[][] res = new int[sortedSet.size()][2];

        int i = 0;

        for(int key : sortedSet) {
            res[i][0] = key;
            res[i++][1] = map.get(key);
        }
        return res;
    }
}