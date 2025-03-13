class Solution {
    public boolean canReorderDoubled(int[] arr) {

        List<Integer> negatives = new ArrayList<>();
        List<Integer> positives = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (num < 0) {
                negatives.add(num);
            } else {
                positives.add(num);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        negatives.sort(Collections.reverseOrder());
        Collections.sort(positives);

        for (int i = 0; i < negatives.size(); i++) {
            int num = negatives.get(i);
            if(map.get(num) == 0) continue;
            int val = num * 2;
            if (map.containsKey(val) && map.get(val) > 0) {
                map.put(val, map.get(val) - 1);
                map.put(num, map.get(num) - 1);
            } else {
                return false;
            }
        }

        for (int i = 0; i < positives.size(); i++) {
            int num = positives.get(i);
            if(map.get(num) == 0) continue;
            int val = num * 2;
            if (map.containsKey(val) && map.get(val) > 0) {
                map.put(val, map.get(val) - 1);
                map.put(num, map.get(num) - 1);
            } else {
                return false;
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > 0) {
                return false;
            }
        }
        
        return true;
    }
}