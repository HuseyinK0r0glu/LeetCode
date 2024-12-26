class Solution {
    public boolean checkDistances(String s, int[] distance) {

        int[] array = new int[26];
        Arrays.fill(array, -1);

        for(int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';
            if(array[val] == -1) {
                array[val] = i;
            }else {
                if(distance[val] != i - array[val] - 1) {
                    return false;
                }
            }
        }
        return true;
    }
}