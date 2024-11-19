class Solution {
    public static double trimMean(int[] arr) {

        Arrays.sort(arr);

        int fivePer = arr.length * 5 / 100;

        int total = 0;

        for(int i = fivePer;i<arr.length-fivePer;i++){
            total += arr[i];
        }

        int count = arr.length - 2 * fivePer;
        return (double) total / count;
    }
}