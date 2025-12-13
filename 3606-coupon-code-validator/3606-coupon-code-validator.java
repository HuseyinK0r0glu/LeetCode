import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {

        List<String> result = new ArrayList<>();

        List<String> businesses = new ArrayList<>();
        businesses.add("electronics");
        businesses.add("grocery");
        businesses.add("pharmacy");
        businesses.add("restaurant");

        for(String b : businesses){
            List<String> list = new ArrayList<>();
            for(int i = 0;i<code.length;i++){
                if(!isActive[i]) continue;
                if(!businessLine[i].equals(b)) continue;
                if(code[i].matches("[A-Za-z0-9_]+")) list.add(code[i]);
            }
            Collections.sort(list);
            result.addAll(list);
        }
        
        return result;
    }
}