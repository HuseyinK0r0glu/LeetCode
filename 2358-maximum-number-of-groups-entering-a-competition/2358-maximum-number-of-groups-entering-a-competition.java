class Solution {
    public static int maximumGroups(int[] grades) {

        int groups = 0;

        Arrays.sort(grades);

        int n = grades.length;

        int k = 1;

        while(n - k >= 0){
            n -= k++;
            groups++;
        }

        return groups;
    }
}