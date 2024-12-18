class Solution {
    public int[] shortestToChar(String s, char c) {

        List<Integer> list = new ArrayList<>(); 
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c) {
                list.add(i);
            }
        }
        
        int[] res = new int[s.length()];
        
        for(int i = 0;i<res.length;i++) {
            int min = Integer.MAX_VALUE;
            for(int index : list) {
                min = Math.min(min,Math.abs(i - index));
            }
            res[i] = min;
        }
        
        return res;
    }
}