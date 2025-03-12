class Solution {
    public int countLargestGroup(int n) {

        int maxSize = 0;
        Map<Integer,List<Integer>> map = new HashMap<>();

        for(int i=1;i<=n;i++){
            int value = i;
            int count = 0;
            while(value > 0){
                count += value % 10;
                value /= 10;
            }

            if(map.containsKey(count)){
                map.get(count).add(i);
                maxSize = Math.max(maxSize,map.get(count).size());
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(count,list);
                maxSize = Math.max(maxSize,list.size());
            }
        }

        int total = 0;
        for(int key : map.keySet()){
            if(map.get(key).size() == maxSize){
                total++;
            }
        }

        return total;
    }
}