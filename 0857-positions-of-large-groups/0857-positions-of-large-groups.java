class Solution {
        public List<List<Integer>> largeGroupPositions(String s) {

            List<List<Integer>> res = new ArrayList<>();
            int i = 0;

            while(i < s.length()) {
                char c = s.charAt(i);
                int j = i+1;
                while(j < s.length() && s.charAt(j) == c) {
                    j++;
                }

                if(j == i+1 || j - i < 3){
                    i = j;
                    continue;
                }

                List<Integer> list = new ArrayList<>();
                list.add(i);
                list.add(j-1);
                res.add(list);
                
                i = j;
            }
            return res;
        }

}