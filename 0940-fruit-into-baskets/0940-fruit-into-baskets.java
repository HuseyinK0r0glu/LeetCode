class Solution {
    public int totalFruit(int[] fruits) {

        Map<Integer,Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        
        int max = 0;
        
        while(i < fruits.length && j < fruits.length) {
            map.put(fruits[i], map.getOrDefault(fruits[i], 0) + 1);
            if(map.size() > 2){
                while(j < i && map.size() > 2){
                    if(map.get(fruits[j]) == 1){
                        map.remove(fruits[j]);
                    }else {
                        map.put(fruits[j], map.get(fruits[j]) - 1);
                    }
                    j++;
                }
            }
            int total = 0;
            for(int key : map.keySet()){
                total += map.get(key);
            }
            max = Math.max(max,total);
            i++;
        }
        return max;
    }
}