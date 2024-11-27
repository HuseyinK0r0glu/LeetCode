class Solution {
    public static int equalPairs(int[][] grid) {
        
        Map<List<Integer>,Integer> map = new HashMap<>();
        // rows
        for(int i = 0;i<grid.length;i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0;j<grid[0].length;j++) {
                list.add(grid[i][j]);
            }
            map.put(list,map.getOrDefault(list,0)+1);
        }

        int total = 0;

        // cols
        for(int j = 0;j<grid[0].length;j++) {
            List<Integer> list = new ArrayList<>();
            for(int i = 0;i<grid.length;i++) {
                list.add(grid[i][j]);
            }
            if(map.containsKey(list)) total += map.get(list);
        }

        return total;
    }
}