class Solution {
    public int[] getStrongest(int[] arr, int k) {

        int[] medianArray = arr.clone();
        Arrays.sort(medianArray);
        int median = medianArray[(medianArray.length - 1) / 2];

        Integer[] indices = new Integer[arr.length];
        for(int i = 0; i < indices.length; i++) {
            indices[i] = i;
        }

        // sort does not work with primitives,only works with objects
        Arrays.sort(indices,(i,j) -> {

            int diffI = Math.abs(arr[i] - median);
            int diffJ = Math.abs(arr[j] - median);

            if(diffI == diffJ) {
                return arr[j] - arr[i];
            }
            return diffJ - diffI;
        });

        int[] result = new int[k];
        for(int i = 0; i < k; i++) {
            result[i] = arr[indices[i]];
        }
        return result;
    }
}