class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        
        Map<Integer,Integer> map = new HashMap<>();
        
        int[] pca = new int[A.length];
        
        for(int i = 0;i<A.length;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
            map.put(B[i],map.getOrDefault(B[i],0)+1);
            int total = 0;
            for(int key : map.keySet()){
                if(map.get(key) % 2 == 0) total++;
            }
            
            pca[i] = total;
        }
        
        return pca;
    }
}