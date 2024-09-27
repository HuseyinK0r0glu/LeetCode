class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        int N = arr1.length;
        
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        
        for(int i=0;i<arr2.length;i++){
            
            map.put(arr2[i],i);
            
        }
        
        for(int i=0;i<N;i++){
            
            int min = i;
            
            for(int j=i+1;j<N;j++){
                
                if(check(map,arr1[j],arr1[min])){
                    min = j;
                }
                
            }
            
            int temp = arr1[i];
            arr1[i] = arr1[min];
            arr1[min] = temp;
        }
    
        return arr1;
    }
    
    
    public boolean check(Map<Integer,Integer> map,int i,int j){
        
        if(map.get(i) != null){
            if(map.get(j) != null){
                return map.get(i) < map.get(j);
            }else {
                return true;
            }
        }else {
            if(map.get(j) != null){
                return false;
            }else {
                return i<j;
            }
        }
        
    }
}