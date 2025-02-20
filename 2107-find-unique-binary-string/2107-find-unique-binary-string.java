class Solution {
    public String findDifferentBinaryString(String[] nums) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < nums.length; i++) {
            char c = nums[i].charAt(i);
             
            if(c == '0'){
                sb.append('1');
            }else {
                sb.append('0');
            }
            
        }

        return sb.toString();


        /*
        // with backtracking
        char[] chars = {'0', '1'};

        Set<String> originalSet = new HashSet<>(Arrays.asList(nums));
        Set<String> set = new HashSet<>();

        backtrack(nums.length,set,new StringBuilder(),chars);

        for(String val : set){
            if(!originalSet.contains(val)){
                return val;
            }
        }

        return "";
        */
    }

    public void backtrack(int n,Set<String> set,StringBuilder stringBuilder,char[] arr){

        if(n == stringBuilder.length()){
            String temp = stringBuilder.toString();
            set.add(temp);
            return;
        }

        for(int i = 0;i<arr.length;i++){
            stringBuilder.append(arr[i]);
            backtrack(n,set,stringBuilder,arr);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }

    }
}