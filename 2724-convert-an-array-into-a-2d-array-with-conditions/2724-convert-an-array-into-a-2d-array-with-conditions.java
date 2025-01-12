class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        while(!map.isEmpty()){
            List<Integer> list = new ArrayList<>();
            for (Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator(); it.hasNext();) {
                Map.Entry<Integer, Integer> entry = it.next();
                int key = entry.getKey();
                list.add(key);
                if(map.get(key) == 1){
                    it.remove();
                }else  {
                    map.put(key, map.get(key) - 1);
                }
            }
            res.add(list);
        }

        return res;
    }

}