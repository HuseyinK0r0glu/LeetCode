class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes,(a,b) -> b[1] - a[1]);
        int max = 0;
        int boxes = 0;
        for(int i = 0; i < boxTypes.length && boxes < truckSize; i++) {
            int canGet = Math.min(boxTypes[i][0],truckSize-boxes);
            boxes += canGet;
            max += canGet * boxTypes[i][1];
        }
        return max;
    }
}