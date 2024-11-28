class Solution {
    public static int wordCount(String[] startWords, String[] targetWords) {

        Set<String> startSet = new HashSet<>();

        for(String word : startWords){
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            startSet.add(new String(arr));
        }

        int count = 0;

        for(String target : targetWords){

            int n = target.length();

            for(int i = 0;i<n;i++){
                String temp = target.substring(0,i) + target.substring(i+1);

                char[] arr = temp.toCharArray();
                Arrays.sort(arr);

                temp = new String(arr);

                if(startSet.contains(temp)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}