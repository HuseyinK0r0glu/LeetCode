class Solution {
    public int minPartitions(String n) {

        int max = 0;

        for(char c : n.toCharArray()) {
            int val = Character.getNumericValue(c);
            max = Math.max(max,val);
        }

        return max;
    }
}