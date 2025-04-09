class Solution {
    public int countBalls(int lowLimit, int highLimit) {

        Map<Integer,Integer> map = new HashMap<>();
        int max = 0;
    
        for(int i = lowLimit; i <= highLimit; i++) {
            int j = i;
            int sum = 0;
            while(j > 0){
                sum += j % 10;
                j /= 10;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            max = Math.max(max, map.get(sum));
        }
    
        return max;
    }
}