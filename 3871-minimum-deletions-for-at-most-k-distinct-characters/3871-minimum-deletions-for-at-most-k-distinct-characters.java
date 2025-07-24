class Solution {
    public int minDeletion(String s, int k) {

        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for(char c : map.keySet()){
            list.add(map.get(c));
        }

        Collections.sort(list);

        int totalDeletion = 0;
        int temp = 0;

        while(temp < list.size() - k){
            totalDeletion += list.get(temp);
            temp++;
        }

        return totalDeletion;
    }
}