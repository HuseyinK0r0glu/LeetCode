class Solution {
    public int[] minOperations(String boxes) {

        int[] result = new int[boxes.length()];

        for(int i = 0; i < result.length; i++) {
            int sum = 0;
            for(int j = 0; j < boxes.length(); j++) {
                if(boxes.charAt(j) == '1'){
                    sum += Math.abs(i-j);
                }
            }
            result[i] = sum;
        }

        return result;
    }
}