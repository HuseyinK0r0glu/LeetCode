class Solution {
    public static int countVowelStrings(int n) {
        
        return (n+1) * (n+2) * (n+3) * (n+4) / 24;
        
//         backtrack
//         String[] vowels = {"a", "e", "i", "o", "u"};

//         int[] count = {0};
//         backtrack(vowels,new StringBuilder(),0,n,count);

//         return count[0];
    }

    public static void backtrack(String[] vowels,StringBuilder sb,int index,int n,int[] count) {

        if(sb.length() == n){
            count[0]++;
            return;
        }

        for(int i = index;i<vowels.length;i++){
            sb.append(vowels[i]);
            backtrack(vowels,sb,i,n,count);
            sb.deleteCharAt(sb.length()-1);
        }

    }
}