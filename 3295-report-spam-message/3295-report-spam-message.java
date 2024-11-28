class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {

        Set<String> banSet = new HashSet<>();

        for(String banned : bannedWords){
            banSet.add(banned);
        }

        int banned = 0;

        for(String s : message){
            if(banSet.contains(s)) banned++;
            if(banned >= 2) return true;
        }
        
        return false;

    }
}