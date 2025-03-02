class Solution {
    public int minPartitions(String n) {

                int max = 0;

        for(char c : n.toCharArray()) {
            int val = c - '0';
            max = Math.max(max,val);

            if(max == 9) return max;

        }

        return max;


        /*
        int max = 0;

        for(char c : n.toCharArray()) {
            int val = Character.getNumericValue(c);
            max = Math.max(max,val);
        }

        return max;
        */
    }
}