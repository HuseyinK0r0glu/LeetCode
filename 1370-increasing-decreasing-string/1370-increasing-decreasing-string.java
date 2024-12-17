class Solution {
        public String sortString(String s) {

            Map<Character,Integer> map = new HashMap<>();

            for(char c : s.toCharArray()){
                map.put(c,map.getOrDefault(c,0)+1);
            }

            StringBuilder sb = new StringBuilder();

            while(map.size()>0){

                List<Character> smaller = new ArrayList<>(map.keySet());
                Collections.sort(smaller);

                for(char c : smaller){
                    sb.append(c);
                    if(map.get(c) == 1){
                        map.remove(c);
                    }else{
                        map.put(c,map.get(c)-1);
                    }
                }

                List<Character> bigger = new ArrayList<>(map.keySet());
                bigger.sort(Collections.reverseOrder());

                for(char c : bigger){
                    sb.append(c);
                    if(map.get(c) == 1){
                        map.remove(c);
                    }else{
                        map.put(c,map.get(c)-1);
                    }
                }
            }
            return sb.toString();
        }
}