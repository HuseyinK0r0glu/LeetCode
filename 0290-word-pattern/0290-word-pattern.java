class Solution {
    public static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");

        Map<Character,String> mapPattern = new HashMap<>();
        Map<String,Character> mapWord = new HashMap<>();

        if(words.length != pattern.length()){
            return false;
        }

        for(int i = 0; i < pattern.length(); i++){

            if(mapPattern.containsKey(pattern.charAt(i))){
                if(!mapPattern.get(pattern.charAt(i)).equals(words[i])){
                    return false;
                }
            }else {
                mapPattern.put(pattern.charAt(i),words[i]);
            }

            if(mapWord.containsKey(words[i])){
                if(!mapWord.get(words[i]).equals(pattern.charAt(i))){
                    return false;
                }
            }else{
                mapWord.put(words[i],pattern.charAt(i));
            }

        }

        return true;

    }

}