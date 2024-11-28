class Solution {
        public static List<String> buildArray(int[] target, int n) {

        List<String> list = new ArrayList<>();

        int prev = 1;

        for(int i = 0; i < target.length; i++) {

            int goal = target[i];

            for(int j = prev;j<=goal;j++){
                list.add("Push");
                if(j == goal){
                    break;
                }else {
                    list.add("Pop");
                }
            }

            prev = goal + 1;
        }

        return list;
    }
}