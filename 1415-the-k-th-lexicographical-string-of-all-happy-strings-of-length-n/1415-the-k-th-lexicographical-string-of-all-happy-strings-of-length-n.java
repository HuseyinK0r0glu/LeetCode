class Solution {
    public static String getHappyString(int n, int k) {

        List<String> list = new ArrayList<>();

        String[] arr = new String[3];
        arr[0] = "a";
        arr[1] = "b";
        arr[2] = "c";

        backtrack(n,list,arr,new StringBuilder(),"");
        Collections.sort(list);

        if(k > list.size()) return "";
        return list.get(k-1);
    }

    public static void backtrack(int n,List<String> list,String[] arr,StringBuilder current,String prev){

        if(current.length() == n){
            String temp = current.toString();
            list.add(temp);
            return;
        }

        for(int i = 0;i<arr.length;i++){
            if(!arr[i].equals(prev)){
                current.append(arr[i]);
                backtrack(n,list,arr,current,arr[i]);
                current.deleteCharAt(current.length()-1);
            }
        }

    }
} 