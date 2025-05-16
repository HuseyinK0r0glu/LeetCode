import java.util.*;

class Solution {
    public int findKOr(int[] nums, int k) {

        int res = 0;
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<32;i++){
            int count = 0;
            for(int j=0;j<nums.length;j++){
                if((nums[j] & 1) == 1){
                    count++;
                }
                nums[j] = nums[j] >> 1;
            }
            if(count >= k){
                sb.append(1);
            }else {
                sb.append(0);
            }
        }

        sb.reverse();
        return turnToBinary(sb.toString());
    }

    public int turnToBinary(String s){

        int pow = 0;
        int res = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                res += (1 << pow);
            }
            pow++;
        }

        return res;
    }

}