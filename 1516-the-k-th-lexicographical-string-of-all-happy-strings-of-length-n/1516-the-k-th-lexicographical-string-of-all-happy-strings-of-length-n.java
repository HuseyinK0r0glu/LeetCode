class Solution {
public String getHappyString(int n, int k) {

        List<String> list = new ArrayList<>();

        String[] arr = new String[3];
        arr[0] = "a";
        arr[1] = "b";
        arr[2] = "c";

        backtrack(list,arr,n,"",new StringBuilder());

        if(k > list.size()){
            return "";
        }

        Collections.sort(list);

        return list.get(k-1);

    }

    public void backtrack(List<String> list, String[] arr, int n, String prev,StringBuilder stringBuilder) {

        if(stringBuilder.length()==n){
            String temp = stringBuilder.toString();
            list.add(temp);
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(!arr[i].equals(prev)){
                stringBuilder.append(arr[i]);
                backtrack(list,arr,n,arr[i],stringBuilder);
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }
        }
    }
} 