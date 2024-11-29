class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {

        Map<Integer,Integer> map = new HashMap<>();

        for (int[] ints : items1) {
            map.put(ints[0], ints[1]);
        }

        for(int[] row : items2) {
            if(map.containsKey(row[0])) {
                map.put(row[0], map.get(row[0]) + row[1]);
            }else {
                map.put(row[0], row[1]);
            }
        }

        Set<Integer> sortedSet = new TreeSet<>(map.keySet());
        List<List<Integer>> list = new ArrayList<>();
        
        for(int key : sortedSet) {
            list.add(Arrays.asList(key,map.get(key)));
        }
        return list;
    }
}