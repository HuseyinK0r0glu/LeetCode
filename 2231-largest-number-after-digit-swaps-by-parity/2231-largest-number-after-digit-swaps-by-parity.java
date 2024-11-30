class Solution {
    public int largestInteger(int num) {

        String s = String.valueOf(num);

        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();

        while(num > 0){

            int val = num % 10;
            if(val % 2 == 0){
                evens.add(val);
            }else {
                odds.add(val);
            }
            num = num / 10;
        }

        Collections.sort(odds, Collections.reverseOrder());
        Collections.sort(evens, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        int even = 0;
        int odd = 0;

        for(int i = 0; i < s.length(); i++){

            int val = s.charAt(i) - '0';
            if(val % 2 == 0){
                sb.append(evens.get(even++));
            }else{
                sb.append(odds.get(odd++));
            }
        }

        return Integer.parseInt(sb.toString());
    }

}