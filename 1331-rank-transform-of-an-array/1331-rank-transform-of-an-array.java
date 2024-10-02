class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int[] helper = new int[arr.length];
        
        for(int i = 0;i<arr.length;i++){
            helper[i] = arr[i];
        }
        
        Arrays.sort(helper);

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        int rank = 1;
        
        for(int i : helper){
            if(!map.containsKey(i)){
                map.put(i,rank);
                rank++;
            }
        }
        
        for(int i = 0;i<arr.length;i++){
            arr[i] = map.get(arr[i]);
        }
        
        return arr;
        
    }
}