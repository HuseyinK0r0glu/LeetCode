class Solution {
    public int minimumRounds(int[] tasks) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int task : tasks){
            map.put(task,map.getOrDefault(task,0)+1);
        }

        int totalRounds = 0;

        for(int key : map.keySet()){
            if(map.get(key)==1){
                return -1;
            }

            int freq = map.get(key);
            while(freq > 1){

                if(freq % 3 == 0){
                    totalRounds += freq / 3;
                    break;
                }

                if(freq >= 3 && (freq - 3) % 2 == 0){
                    totalRounds += 1;
                    freq -= 3;
                    continue;
                }

                if(freq >= 6 && (freq - 6) % 2 == 0){
                    totalRounds += 2;
                    freq -= 6;
                    continue;
                }

                if(freq >= 9 && (freq - 9) % 2 == 0){
                    totalRounds += 3;
                    freq -= 9;
                    continue;
                }

                if(freq >= 12 && (freq - 12) % 2 == 0){
                    totalRounds += 4;
                    freq -= 12;
                    continue;
                }

                totalRounds += 1;
                freq -= 2;


            }
            if(freq == 1){
                return -1;
            }

        }

        return totalRounds;
    }
}