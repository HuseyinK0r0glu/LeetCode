class Solution {
    public static List<Integer> findPeaks(int[] mountain) {

        List<Integer> list = new ArrayList<>();

        for(int i = 0;i<mountain.length;i++){

            if(i != 0 && i != mountain.length-1 && mountain[i-1] < mountain[i] && mountain[i] > mountain[i+1]){
                list.add(i);
            }

        }

        return list;
    }
}