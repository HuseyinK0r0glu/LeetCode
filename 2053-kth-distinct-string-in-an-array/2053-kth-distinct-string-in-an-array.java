class Solution {
    public static String kthDistinct(String[] arr, int k) {

        Map<String,Integer> map = new LinkedHashMap<>();

        for(String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for(String s : map.keySet()) {
            if(map.get(s) == 1) {
                k--;
                if(k == 0){
                    return s;
                }
            }
        }

        return "";
    }
}