class Solution {
    public static List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> res = new ArrayList<>();
        for(String s : words){
            if(s.length()!=pattern.length()){
                continue;
            }
            Map<Character,Character> mapPattern = new HashMap<>();
            Map<Character,Character> mapS = new HashMap<>();
            boolean flag = true;
            for(int i = 0;i<pattern.length();i++){
                if(mapPattern.containsKey(pattern.charAt(i))){
                    if(mapPattern.get(pattern.charAt(i)) != s.charAt(i)){
                        flag = false;
                        break;
                    }
                }else {
                    mapPattern.put(pattern.charAt(i),s.charAt(i));
                }

                if(mapS.containsKey(s.charAt(i))){
                    if(mapS.get(s.charAt(i)) != pattern.charAt(i)){
                        flag = false;
                        break;
                    }
                }else {
                    mapS.put(s.charAt(i),pattern.charAt(i));
                }

            }
            if(flag){
                res.add(s);
            }
        }

        return res;
    }
}