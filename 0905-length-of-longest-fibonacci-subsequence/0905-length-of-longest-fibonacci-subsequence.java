import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int lenLongestFibSubseq(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for(int a : arr){
            set.add(a);
        }

        int maxLen = 0;

        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                int prev = arr[i];
                int curr= arr[j];
                int len = 2;
                while(set.contains(prev + curr)){
                    int newValue = prev + curr;
                    prev = curr;
                    curr = newValue;
                    len++;
                }
                maxLen = Math.max(maxLen,len);
            }
        }

        return maxLen == 2 ? 0 : maxLen;
    }
}