class Solution {
    public int minOperations(int[][] grid, int x) {

        int[] array = new int[grid.length * grid[0].length];
        int index = 0;
        int remainder = grid[0][0] % x;

        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                if (ints[j] % x != remainder) {
                    return -1;
                }
                array[index++] = ints[j];
            }
        }

        Arrays.sort(array);
        int middle = array[array.length/2];
        
        int count = 0;
        
        for(int num : array){
            count += (Math.abs(middle - num) / x);
        }
        
        return count;
    }
}