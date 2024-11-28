class Solution {
    public static int minimumChairs(String s) {

        int people = 0;
        int maxPeople = 0;

        for(char c : s.toCharArray()){

            if(c == 'E'){
                people++;
            }else {
                people--;
            }
            maxPeople = Math.max(maxPeople, people);
        }
        return maxPeople;
    }
}