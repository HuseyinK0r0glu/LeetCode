class Solution {
    public String arrangeWords(String text) {

        String[] words = text.split(" ");

        words[0] = words[0].toLowerCase();

        Arrays.sort(words,(a,b) -> {
            if(a.length() != b.length()){
                return Integer.compare(a.length(),b.length());
            }
            return 0;
        });

        String res = String.join(" ", words);

        res = res.substring(0,1).toUpperCase() + res.substring(1);

        return res;
    }
}