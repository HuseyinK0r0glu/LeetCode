class Solution {
    public int[] distributeCandies(int candies, int num_people) {

        int[] result = new int[num_people];
        int candy = 1;
        int index = 0;

        while(candies - candy >= 0) {

            result[index] += candy;

            candies -= candy;
            candy++;
            index = (index + 1) % num_people;
        }
        result[index] += candies;
        return result;
    }
}