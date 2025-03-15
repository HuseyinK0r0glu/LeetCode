class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {

        List<Boolean> res = new ArrayList<>();

        for(int i = 0; i < l.length; i++){
            int left = l[i];

            int[] temp = new int[r[i] - left + 1];
            for(int j = 0; j < temp.length; j++){
                temp[j] = nums[left + j];
            }

            Arrays.sort(temp);

            boolean valid = true;
            int diff = temp[1]  - temp[0];

            for(int j = 1; j < temp.length; j++){
                if(temp[j] - temp[j-1] != diff){
                    res.add(false);
                    valid = false;
                    break;
                }
            }
            if(valid){
                res.add(true);
            }
        }

        return res;
    }
}