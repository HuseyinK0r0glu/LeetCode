class Solution {
public static int[] findEvenNumbers(int[] digits) {

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < digits.length; i++) {
            map.put(digits[i], map.getOrDefault(digits[i], 0) + 1);
        }

        for(int i = 100;i<999;i = i+2){

            int num = i;

            Map<Integer,Integer> temp = new HashMap<>();

            while(num > 0){
                int val = num % 10;
                temp.put(val, temp.getOrDefault(val, 0) + 1);
                num /= 10;
            }

            boolean possible = true;

            for(int key : temp.keySet()){
                if(temp.get(key) > map.getOrDefault(key,0)){
                    possible = false;
                }
            }

            if(possible){
                list.add(i);
            }
        }

        return list.stream().mapToInt(i -> i).toArray();
    }
}