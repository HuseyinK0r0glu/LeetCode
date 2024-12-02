class Solution {
    public int findKthPositive(int[] arr, int k) {

        Set<Integer> set = new HashSet<>();

        for(int num : arr) {
            set.add(num);
        }

        int missing = 0;
        int count = 1;

        while(k > 0){
            if(!set.contains(count++)){
                missing = count - 1;
                k--;
            }
        }
        return missing;
    }
}